package com.codingkapoor.codingbat

object WarmupI {

  def sleepIn(weekday: Boolean, vacation: Boolean): Boolean = {
    !weekday || vacation
  }

  def monkeyTrouble(aSmile: Boolean, bSmile: Boolean): Boolean = {
    (aSmile && bSmile) || (!aSmile && !bSmile)
  }

}
