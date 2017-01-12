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

  def makeEnds(arr: Array[Int]): Array[Int] = {
    if (arr.length <= 1) arr else Array(arr.head, arr.last)
  }

  def has23(arr: Array[Int]): Boolean = {
    arr.exists(x => x == 2 || x == 3)
  }

  def no23(arr: Array[Int]): Boolean = {
    !arr.contains(2) && !arr.contains(3)
  }

  def makeLast(arr: Array[Int]): Array[Int] = {
    val res = Array.fill(arr.length * 2)(0)
    res(res.length - 1) = arr.last

    res
  }

  def double23(arr: Array[Int]): Boolean = {
    arr.filter(_ == 2).size == 2 || arr.filter(_ == 3).size == 2
  }

  def fix23(arr: Array[Int]): Array[Int] = {
    arr.mkString.replaceAll("23", "20").toArray.map(_.toString).map(_.toInt)
  }

  def start1(a: Array[Int], b: Array[Int]): Int = {
    Array(a.take(1), b.take(1)).flatten.filter(_ == 1).size
  }

  def biggerTwo(a: Array[Int], b: Array[Int]): Array[Int] = {

    val sumA = a.foldLeft(0)(_ + _)
    val sumB = b.foldLeft(0)(_ + _)

    if (sumA > sumB) a else if (sumA < sumB) b else a
  }

}
