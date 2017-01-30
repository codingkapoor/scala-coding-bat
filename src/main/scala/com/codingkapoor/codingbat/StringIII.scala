package com.codingkapoor.codingbat

object StringIII {

  def countYZ(str: String): Int = {
    str.split(" ").map(_.toLowerCase).count(x => x.endsWith("y") || x.endsWith("z"))
  }

  def withoutString(base: String, remove: String): String = {
    val pattern = s"$remove".r
    pattern.replaceAllIn(base, "")
  }

  def equalIsNot(str: String): Boolean = {
    val res = str.split(" ").map(_.toLowerCase).mkString

    val pattern1 = "is".r
    val pattern2 = "not".r
    pattern1.findAllIn(res).size == pattern2.findAllIn(res).size
  }

  def gHappy(str: String): Boolean = {
    val pattern = "[^g]g[^g]".r
    pattern.findAllIn(str).isEmpty
  }

}
