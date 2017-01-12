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

  def commonEnd(a: Array[Int], b: Array[Int]): Boolean = {
    if (a.length < 1 || b.length < 1) false else a.head == b.head || a.last == b.last
  }

  def sum3(arr: Array[Int]): Int = {
    arr.reduceLeft(_ + _)
  }

  def rotateLeft3(arr: Array[Int]): Array[Int] = {
    arr.tail :+ arr.head
  }

  def reverse3(arr: Array[Int]): Array[Int] = {
    arr.reverse
  }

  def maxEnd3(arr: Array[Int]): Array[Int] = {
    val res = if (arr.head > arr.last) arr.head else arr.last
    Array.fill(arr.length) { res }
  }

  def sum2(arr: Array[Int]): Int = {
    if (arr.length < 1) 0 else arr.take(2).reduceLeft(_ + _)
  }

  def middleWay(a: Array[Int], b: Array[Int]): Array[Int] = {
    Array(a(1), b(1))
  }

  def makeEnds(arr: Array[Int]) = {
    if (arr.length <= 1) arr else Array(arr.head, arr.last)
  }
}
