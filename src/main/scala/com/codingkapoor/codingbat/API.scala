package com.codingkapoor.codingbat

object API {

  def scoresIncreasing(scores: Array[Int]): Boolean = {
    scores.sliding(2).forall { case Array(x, y) => x < y || x == y }
  }

  def scores100(arr: Array[Int]): Boolean = {
    arr.sliding(2).count(x => x(0) == 100 && x(1) == 100) > 0
  }

  def scoresClump(scores: Array[Int]): Boolean = {
    scores.sliding(3).count {
      case Array(x, y, z) => Math.abs(x - y) <= 2 && Math.abs(y - z) <= 2 && Math.abs(z - x) <= 2
    } > 0
  }

  // TODO
  def scoresAverage() = {}

  def wordsCount(words: Array[String], len: Int) = {
    words.map(_.length).count(_ == len)
  }

  def wordsFront(words: Array[String], n: Int) = {
    words.take(n)
  }

  def wordsWithoutList(words: Array[String], len: Int) = {
    words.filterNot(_.length == len)
  }

  def hasOne(n: Int): Boolean = {
    n.toString.map(_.asDigit).contains(1)
  }

  def dividesSelf(n: Int): Boolean = {
    val digits = n.toString.map(_.asDigit)
    if (digits.contains(0)) return false

    digits.forall(x => n % x == 0)
  }

  def copyEvens(nums: Array[Int], count: Int): Array[Int] = {
    nums.filter(_ % 2 == 0).take(count)
  }

  def copyEndy(arr: Array[Int], count: Int): Array[Int] = {
    arr.filter(x => x >= 0 && x <= 10 || x >= 90 && x <= 100).take(count)
  }

  def matchUp(arr1: Array[String], arr2: Array[String]) = {
    arr1.zip(arr2).count(x => x._2.startsWith(x._1.head.toString))
  }

}
