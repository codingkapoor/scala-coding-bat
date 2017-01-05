package com.codingkapoor.codingbat

object WarmupII {

  def stringTimes(str: String, n: Int) = {
    str * n
  }

  def frontTimes(str: String, n: Int): String = {
    str.take(3) * n
  }

  def countXX(str: String): Int = {
    val pattern = "(?=xx)".r
    pattern.findAllIn(str).size
  }
}
