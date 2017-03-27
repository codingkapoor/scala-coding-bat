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

}
