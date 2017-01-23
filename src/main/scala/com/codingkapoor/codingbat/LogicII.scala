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

  def noTeenSum(a: Int, b: Int, c: Int): Int = {
    val ls = (13 to 19).toList.filterNot(x => x == 15 || x == 16)
    List(a, b, c).diff(ls).sum
  }

  def roundSum(a: Int, b: Int, c: Int): Int = {
    val ls = List(a, b, c)
    ls.map {
      x => if (x % 10 >= 5) ((x / 10) + 1) * 10 else (x / 10) * 10
    }.sum
  }

  def closeFar(a: Int, b: Int, c: Int): Boolean = {
    if (Math.abs(b - a) <= 1)
      Math.abs(c - a) >= 2 && Math.abs(c - b) >= 2
    else if (Math.abs(c - a) <= 1)
      Math.abs(b - a) >= 2 && Math.abs(b - c) >= 2
    else false
  }

}
