package com.codingkapoor.codingbat

object API {

  def scoresIncreasing(scores: Array[Int]): Boolean = {
    scores.sliding(2).forall { case Array(x, y) => x < y || x == y }
  }

  def scores100(arr: Array[Int]): Boolean = {
    arr.sliding(2).count(x => x(0) == 100 && x(1) == 100) > 0
  }

}
