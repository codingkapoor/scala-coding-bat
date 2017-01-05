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

  def doubleX(str: String): Boolean = {
    val ls = str.toList.zipWithIndex.filter(_._1 == 'x').view take (2)
    ls(1)._2 == ls(0)._2 + 1
  }

  def stringBits(str: String): String = {
    str.toList.zipWithIndex.filter(_._2 % 2 == 0).map(_._1).mkString
  }

  def stringSplosion(str: String) = {
    def recursive(n: Int, str: String): String = {
      if (n == 0) str
      else recursive(n - 1, str.take(n - 1)) + str
    }

    recursive(str.length(), str)
  }
}
