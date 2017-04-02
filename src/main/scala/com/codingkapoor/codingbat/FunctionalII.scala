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

}
