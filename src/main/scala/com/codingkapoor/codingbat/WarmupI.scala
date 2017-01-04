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
    if (talking && (hour < 7 || hour > 20)) true else false
  }

  def makes10(a: Int, b: Int): Boolean = {
    if (a == 10 || b == 10 || a + b == 10) true else false
  }
  
}
