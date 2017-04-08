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

}
