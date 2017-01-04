package com.codingkapoor.codingbat

object WarmupI {

  def sleepIn(weekday: Boolean, vacation: Boolean): Boolean = {
    !weekday || vacation
  }

  def monkeyTrouble(aSmile: Boolean, bSmile: Boolean): Boolean = {
    (aSmile && bSmile) || (!aSmile && !bSmile)
  }

  def sumDouble(a: Int, b: Int): Int = {
    if (a == b) 4 * a else a + b
  }

  def diff21(n: Int): Int = {
    val absDiff = Math.abs(n - 21);
    if (n > 21) 2 * absDiff else absDiff
  }

  def parrotTrouble(talking: Boolean, hour: Int): Boolean = {
    talking && (hour < 7 || hour > 20)
  }

  def makes10(a: Int, b: Int): Boolean = {
    a == 10 || b == 10 || a + b == 10
  }

  def nearHundred(n: Int): Boolean = {
    Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10
  }

  def posNeg(a: Int, b: Int, negative: Boolean): Boolean = {
    if (negative) a < 0 && b < 0
    else a < 0 || b < 0
  }

  def notString(str: String): String = {
    if (str.startsWith("not")) str else "not " + str
  }

  def missingChar(str: String, n: Int): String = {
    str.take(n) + str.drop(n + 1)
  }

  def frontBack(str: String): String = {
    str.last + str.init.drop(1) + str.take(1)
  }

  def front3(str: String): String = {
    str.take(3) * 3
  }

  def backAround(str: String): String = {
    str.last + str + str.last
  }

  def or35(n: Int): Boolean = {
    (n % 3 == 0) || (n % 5 == 0)
  }

}
