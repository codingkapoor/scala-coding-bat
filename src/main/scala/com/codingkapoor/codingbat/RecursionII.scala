package com.codingkapoor.codingbat

object RecursionII {

  def groupSum(start: Int, ls: List[Int], target: Int) = {
    (1 to ls.size).exists(y => ls.drop(start).combinations(y).exists(x => x.sum == target))

  }

  def groupSum2(start: Int, ls: List[Int], target: Int) = {
    (1 to ls.size).exists(y => ls.drop(start).permutations.toList.map(x => x.take(y)).map(_.sorted).distinct.exists(x => x.take(y).sum == target))
  }

  def groupSum6(start: Int, ls: List[Int], target: Int) = {
    (1 to ls.size).exists(y => ls.drop(start).combinations(y).filter(x => x.count(_ == 6) == ls.count(_ == 6)).exists(x => x.sum == target))
  }

  def groupNoAdj(start: Int, ls: List[Int], target: Int) = {
    val ls1 = ls.drop(start).zipWithIndex
    val ls2 = List(ls1.filter(x => x._2 % 2 == 0).map(_._1), ls1.filter(x => x._2 % 2 != 0).map(_._1))
    (1 to ls.size).exists(y => ls2.exists(t => t.combinations(y).exists(x => x.sum == target)))
  }

}
