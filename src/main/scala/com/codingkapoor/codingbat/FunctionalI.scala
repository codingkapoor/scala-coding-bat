package com.codingkapoor.codingbat

object FunctionalI {

  def doubling(nums: List[Int]): List[Int] = {
    nums.map(_ * 2)
  }

  def square(nums: List[Int]): List[Int] = {
    nums.map(x => x * x)
  }

}
