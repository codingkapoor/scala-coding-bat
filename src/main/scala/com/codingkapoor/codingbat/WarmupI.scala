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
}
