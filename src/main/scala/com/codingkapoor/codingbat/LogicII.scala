package com.codingkapoor.codingbat

object LogicII {

  def makeBricks(small: Int, big: Int, goal: Int): Boolean = {
    val smallSize = small
    val bigSize = big * 5

    smallSize == goal || bigSize == goal || smallSize + bigSize == goal
  }

  def loneSum(a: Int, b: Int, c: Int): Int = {
    val ls = List(a, b, c)
    val distinct = ls.distinct

    distinct.diff(ls.diff(distinct)).sum
  }

  def luckySum(a: Int, b: Int, c: Int): Int = {
    val ls = List(a, b, c)
    val index = ls.indexOf(13)

    if (index < 0) ls.sum else ls.take(index).sum
  }
}
