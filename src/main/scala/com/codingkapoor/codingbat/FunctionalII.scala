package com.codingkapoor.codingbat

object FunctionalII {

  def noNeg(nums: List[Int]): List[Int] = {
    nums.filter(_ >= 0)
  }

  def no9(nums: List[Int]): List[Int] = {
    nums.filterNot(x => x % 10 == 9)
  }

  def noTeen(nums: List[Int]): List[Int] = {
    nums.filterNot(x => x >= 13 && x <= 19)
  }

  def noLong(strings: List[String]): List[String] = {
    strings.filterNot(_.length >= 4)
  }

  def noZ(strings: List[String]): List[String] = {
    strings.filterNot(_.contains('z'))
  }

  def no34(strings: List[String]): List[String] = {
    strings.filterNot(x => x.length == 3 || x.length == 4)
  }

  def noYY(strings: List[String]): List[String] = {
    strings.map(_ + "y").filterNot(_.contains("yy"))
  }

  def two2(nums: List[Int]): List[Int] = {
    nums.map(_ * 2).filterNot(_ % 10 == 2)
  }

}
