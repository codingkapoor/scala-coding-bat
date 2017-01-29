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
    arr.sum
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
    if (arr.length < 1) 0 else arr.take(2).sum
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
    arr.count(_ == 2) == 2 || arr.count(_ == 3) == 2
  }

  def fix23(arr: Array[Int]): Array[Int] = {
    arr.mkString.replaceAll("23", "20").toArray.map(_.toString).map(_.toInt)
  }

  def start1(a: Array[Int], b: Array[Int]): Int = {
    Array(a.take(1), b.take(1)).flatten.count(_ == 1)
  }

  def biggerTwo(a: Array[Int], b: Array[Int]): Array[Int] = {

    val sumA = a.sum
    val sumB = b.sum

    if (sumA > sumB) a else if (sumA < sumB) b else a
  }

  def makeMiddle(nums: Array[Int]): Array[Int] = {
    Array(nums((nums.length / 2) - 1), nums(nums.length / 2))
  }

  def plusTwo(a: Array[Int], b: Array[Int]): Array[Int] = {
    a ++ b
  }

  def swapEnds(arr: Array[Int]): Array[Int] = {
    if (arr.length < 2) arr else {
      val first = arr(0); val last = arr(arr.length - 1)
      arr(0) = last; arr(arr.length - 1) = first
      arr
    }
  }

  def midThree(arr: Array[Int]): Array[Int] = {
    val mid = arr.length / 2
    Array(arr(mid - 1), arr(mid), arr(mid + 1))
  }

  def maxTriple(arr: Array[Int]): Int = {
    if (arr.length == 1) arr(0)
    Array(arr(0), arr(arr.length / 2), arr(arr.length - 1)).max
  }

  def frontPiece(arr: Array[Int]): Array[Int] = {
    if (arr.length < 2) arr else Array(arr(0), arr(1))
  }

  def unlucky1(arr: Array[Int]): Boolean = {
    if (arr.length < 2) false else {
      val res = arr.zip(arr.tail).map(x => s"${x._1}" + s"${x._2}")
      res.head == "13" || res.tail.head == "13" || res.last == "13"
    }
  }

  def make2(a: Array[Int], b: Array[Int]): Array[Int] = {
    (a ++ b).take(2)
  }

  def front11(a: Array[Int], b: Array[Int]): Array[Int] = {
    def getFirst(arr: Array[Int]) = if (arr.length < 1) "" else s"${arr.head}"

    val res = getFirst(a) + getFirst(b)
    res.toArray.map(_.toString).map(_.toInt)
  }
}
