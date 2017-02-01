package com.codingkapoor.codingbat

import scala.annotation.tailrec

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

  def countTriple(str: String) = {

  }

  def sumDigits(str: String): Int = {
    val pattern = "[0-9]".r
    pattern.findAllIn(str).toList.map(_.toInt).sum
  }

  def sameEnds(str: String): String = {

    val mid = str.length / 2 - 1

    @tailrec
    def sameEndsR(mid: Int): String = {
      if (mid < 0) ""
      else {
        if (str.take(mid + 1) == str.drop(str.length - (mid + 1))) str.take(mid + 1)
        else sameEndsR(mid - 1)
      }
    }

    sameEndsR(mid)
  }

  def mirrorEnds(str: String): String = {
    str.zip(str.reverse).takeWhile(x => x._1 == x._2).map(x => x._1).mkString
  }

  def maxBlock(str: String) = {}

  def sumNumbers(str: String): Int = {
    val pattern = "[0-9]+".r
    pattern.findAllIn(str).toList.map(_.toInt).sum
  }

  def notReplace(str: String) = {}

}
