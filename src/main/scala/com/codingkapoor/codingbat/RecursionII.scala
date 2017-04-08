package com.codingkapoor.codingbat

import scala.annotation.tailrec

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

  def groupSum5(start: Int, ls: List[Int], target: Int) = {

    @tailrec
    def drop1Mul5(res: List[Int], ls: List[Int]): List[Int] = ls match {
      case Nil => res
      case x :: Nil => drop1Mul5(res :+ x, Nil)
      case x :: xs => if (x % 5 == 0 && xs.head == 1) drop1Mul5(res :+ x, xs.tail) else drop1Mul5(res :+ x, xs)
    }

    val ks = drop1Mul5(Nil, ls)

    (1 to ks.size).exists(y => ks.drop(start).combinations(y).filter(x => x.count(_ % 5 == 0) == ks.count(_ % 5 == 0)).exists(x => x.sum == target))
  }

}
