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

  def scoresAverage(scores: Array[Int]): Int = {
    val (x, y) = scores.splitAt(scores.length / 2)
    val avgX = x.sum / x.length
    val avgY = y.sum / y.length

    if (avgX > avgY) avgX else avgY
  }

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

  def scoreUp(key: Array[String], answers: Array[String]) = {
    key.zip(answers).map {
      x => if (x._1 == x._2) 4 else if (x._2 == "?") 0 else -1
    }.sum
  }

  def wordsWithout(words: Array[String], target: String) = {
    words.filterNot(_ == target)
  }

  def scoresSpecial(score1: Array[Int], score2: Array[Int]) = {
    val res1 = score1.filter(_ % 10 == 0)
    val res2 = score2.filter(_ % 10 == 0)

    (if (res1.isEmpty) 0 else res1.max) + (if (res2.isEmpty) 0 else res2.max)
  }

  def sumHeights(heights: Array[Int], start: Int, end: Int) = {
    heights.slice(start, end + 1).sliding(2).map { case Array(x, y) => Math.abs(y - x) }.sum
  }


  def sumHeights2(heights: Array[Int], start: Int, end: Int) = {
    heights.slice(start, end + 1).sliding(2).map {
      case Array(x, y) if x < y => (y - x) * 2
      case Array(x, y) if x > y => x - y
    }.sum
  }

  def bigHeights(heights: Array[Int], start: Int, end: Int) = {
    heights.slice(start, end + 1).sliding(2).map {
      case Array(x, y) => if (Math.abs(y - x) >= 5) 1 else 0
    }.sum
  }

  def userCompare(aName: String, aId: Int, bName: String, bId: Int) = {
    if (aName < bName) -1
    else if (aName > bName) 1
    else if (aName == bName) {
      if (aId < bId) -1 else if (aId > bId) 1 else 0
    }
  }

  def mergeTwo(arr1: Array[String], arr2: Array[String], n: Int) = {
    arr1.zipAll(arr2, "", "").flatMap {
      x => Array(x._1, x._2)
    }.filterNot(_ == "").distinct.take(n).sorted
  }

  def commonTwo(arr1: Array[String], arr2: Array[String]) = {
    arr1.intersect(arr2).length
  }

}
