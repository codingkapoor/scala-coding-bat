package com.codingkapoor.codingbat

object FunctionalI {

  def doubling(nums: List[Int]): List[Int] = {
    nums.map(_ * 2)
  }

  def square(nums: List[Int]): List[Int] = {
    nums.map(x => x * x)
  }

  def addStar(strings: List[String]): List[String] = {
    strings.map(x => x + "*")
  }

  def copies3(strings: List[String]): List[String] = {
    strings.map(x => x * 3)
  }

  def moreY(strings: List[String]): List[String] = {
    strings.map(x => "y" + x + "y")
  }

  def math1(nums: List[Int]): List[Int] = {
    nums.map(x => (x + 1) * 10)
  }

  def rightDigit(nums: List[Int]): List[Int] = {
    nums.map(_ % 10)
  }

  def lower(strings: List[String]): List[String] = {
    strings.map(_.toLowerCase)
  }

}
