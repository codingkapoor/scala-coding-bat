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

  def no14(nums: Array[Int]): Boolean = {
    (nums.contains(1) && !nums.contains(4)) || (!nums.contains(1) && nums.contains(4))
  }

  def isEverywhere(nums: Array[Int], value: Int): Boolean = {
    nums.iterator.sliding(2).toList.count(x => x.head == value || x.last == value) == nums.length - 1
  }

  def either24(nums: Array[Int]): Boolean = {
    val twos = nums.iterator.sliding(2).toList.count(x => x.head == 2 && x.last == 2)
    val fours = nums.iterator.sliding(2).toList.count(x => x.head == 4 && x.last == 4)

    twos > 0 && fours == 0 || twos == 0 && fours > 0
  }

  def matchUp(nums: Array[Int], nums2: Array[Int]): Int = {
    nums.zip(nums2).count(x => Math.abs(x._1 - x._2) <= 2 && Math.abs(x._1 - x._2) != 0)
  }

  def has77(nums: Array[Int]): Boolean = {
    val pattern = "7[0-9]?7".r
    pattern.findAllIn(nums.mkString).nonEmpty
  }

  def has12(nums: Array[Int]): Boolean = {
    val pattern = "1[0-9]*2".r
    pattern.findAllIn(nums.mkString).nonEmpty
  }

  def modThree(nums: Array[Int]): Boolean = {
    val pattern = "[13579][13579][13579]|[2468][2468][2468]".r
    pattern.findAllIn(nums.mkString).nonEmpty
  }

  def haveThree(nums: Array[Int]): Boolean = {
    val pattern = "3[0-9]+3[0-9]+3".r
    pattern.findAllIn(nums.mkString).toList.flatMap(_.toList).count(_ == '3') == 3
  }

  def twoTwo(nums: Array[Int]): Boolean = {
    val pattern = "(?=(22))".r
    pattern.findAllMatchIn("2242").map(_.group(1)).toList.flatten.size == nums.count(_ == 2)
  }
}
