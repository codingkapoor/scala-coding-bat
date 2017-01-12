package com.codingkapoor.codingbat

object ArrayI {

  def firstLast6(arr: Array[Int]): Boolean = {
    if (arr.length < 1) false else arr.head == 6 || arr.last == 6
  }

  def sameFirstLast(arr: Array[Int]): Boolean = {
    if (arr.length < 1) false else arr.head == arr.last
  }

  def makePi(): Array[Int] = {
    Math.PI.toString.take(4).replace(".", "").toArray.map(_.toString).map(_.toInt)
  }
}
