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

  def doubleX(str: String) = {
    val ls = str.toList.zipWithIndex.filter(_._1 == 'x').view take (2)
    ls(1)._2 == ls(0)._2 + 1
  }
  
}
