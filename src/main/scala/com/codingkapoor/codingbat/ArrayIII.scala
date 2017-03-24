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

}
