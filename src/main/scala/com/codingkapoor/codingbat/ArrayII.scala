package com.codingkapoor.codingbat

object ArrayII {

  def countEvens(nums: Array[Int]): Int = {
    nums.count(_ % 2 == 0)
  }

  def bigDiff(nums: Array[Int]): Int = {
    nums.max - nums.min
  }

  def centeredAverage(nums: Array[Int]): Int = {
    val arr = nums.sorted
    arr.slice(1, arr.length - 1).sum / (arr.length - 2)
  }

  def sum13(nums: Array[Int]): Int = {
    if (nums.length == 0) 0
    else nums.filter(_ < 13).sum
  }

  def sum67(nums: Array[Int]): Int = {
    val pattern = "6[0-9]*7".r
    pattern.replaceAllIn(nums.mkString, "").toArray.map(_.toString).map(_.toInt).sum
  }

  def has22(nums: Array[Int]): Boolean = {
    nums.iterator.sliding(2).toList.contains(List(2, 2))
  }

  def lucky13(nums: Array[Int]): Boolean = {
    !nums.contains(1) && !nums.contains(3)
  }

  def sum28(nums: Array[Int]): Boolean = {
    nums.filter(_ == 2).sum == 8
  }

  def more14(nums: Array[Int]): Boolean = {
    nums.count(_ == 1) > nums.count(_ == 4)
  }

  def fizzArray(n: Int): Array[Int] = {
    (0 until n).toArray
  }

  def only14(nums: Array[Int]): Boolean = {
    nums.count(x => x == 1 || x == 4) == nums.length
  }

  def fizzArray2(n: Int): Array[String] = {
    (0 until n).toArray.map(_.toString)
  }

}
