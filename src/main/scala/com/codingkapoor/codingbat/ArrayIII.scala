package com.codingkapoor.codingbat

import scala.annotation.tailrec

object ArrayIII {

  def maxSpan(arr: Array[Int]): Int = {
    arr.distinct.map { x => arr.lastIndexOf(x) - arr.indexOf(x) }.max + 1
  }

  def fix34(arr: Array[Int]) = {
    val k1 = arr.zipWithIndex.filter { x => x._1 == 3 }
    val k2 = arr.zipWithIndex.filter { x => x._1 == 4 }
    val ls = k1.zip(k2)

    @tailrec
    def fix34R(res: List[Int], ls: List[((Int, Int), (Int, Int))]): List[Int] = ls match {
      case Nil => res
      case ((3, p), (4, q)) :: Nil => res.updated(q, res(p + 1)).updated(p + 1, 4)
      case ((3, p), (4, q)) :: xs => fix34R(res.updated(q, res(p + 1)).updated(p + 1, 4), xs)
    }

    fix34R(arr.toList, ls.toList).toArray
  }

  def fix45(arr: Array[Int]) = {
    val k1 = arr.zipWithIndex.filter { x => x._1 == 4 }
    val k2 = arr.zipWithIndex.filter { x => x._1 == 5 }
    val ls = k1.zip(k2)

    @tailrec
    def fix45R(res: List[Int], ls: List[((Int, Int), (Int, Int))]): List[Int] = ls match {
      case Nil => res
      case ((4, p), (5, q)) :: Nil => res.updated(q, res(p + 1)).updated(p + 1, 5)
      case ((4, p), (5, q)) :: xs => fix45R(res.updated(q, res(p + 1)).updated(p + 1, 5), xs)
    }

    fix45R(arr.toList, ls.toList).toArray
  }

  def canBalance(ls: Array[Int]) = {

    @tailrec
    def canBalanceR(index: Int): Boolean = {
      if (index == ls.length) false
      else {
        if (ls.take(index).sum == ls.drop(index).sum) true
        else canBalanceR(index + 1)
      }
    }

    canBalanceR(1)
  }

  def linearIn(outer: Array[Int], inner: Array[Int]) = {
    inner.forall(outer.contains)
  }

  def squareUp(n: Int) = {

    @tailrec
    def squareUpR(ls: List[Int], counter: Int): List[Int] = {
      if (counter == 0) ls
      else squareUpR(List.fill(n - counter)(0) ::: List.range(1, counter + 1).reverse ::: ls, counter - 1)
    }

    squareUpR(Nil, n).toArray
  }

  def seriesUp(n: Int) = {

    @tailrec
    def seriesUpR(ls: List[Int], counter: Int): List[Int] = {
      if (counter == 0) ls
      else seriesUpR(List.range(1, counter + 1) ::: ls, counter - 1)
    }

    seriesUpR(Nil, n).toArray
  }

  def maxMirror(ls: Array[Int]) = {
    (1 to ls.length).flatMap {
      y => ls.sliding(y).filter(ks => ls.mkString.contains(ks.mkString.reverse))
    }.map(_.length).max
  }

  def countClumps(nums: Array[Int]) = {
    def split[T](list: List[T]): List[List[T]] = list match {
      case Nil => Nil
      case h :: _ => val segment = list takeWhile h.==
        segment :: split(list drop segment.length)
    }

    split(nums.toList).count(_.size > 1)
  }
}
