package com.codingkapoor.codingbat

object LogicI {

  def cigarParty(cigars: Int, isWeekend: Boolean): Boolean = {
    if (isWeekend) cigars >= 40 else cigars >= 40 && cigars <= 60
  }

  def dateFashion(you: Int, date: Int): Int = {
    if (you >= 8 || date >= 8) 2 else if (you <= 2 || date <= 2) 0 else 1
  }

  def squirrelPlay(temp: Int, isSummer: Boolean): Boolean = {
    if (isSummer) temp >= 60 && temp <= 100 else temp >= 60 && temp <= 90
  }

  def caughtSpeeding(speed: Int, isBirthday: Boolean): Int = {
    if (isBirthday) {
      if (speed <= 65) 0
      else if (speed >= 66 && speed <= 85) 1
      else 2
    } else {
      if (speed <= 60) 0
      else if (speed >= 61 && speed <= 81) 1
      else 2
    }
  }

  def sortaSum(a: Int, b: Int): Int = {
    val sum = a + b
    if (sum >= 10 && sum <= 19) 20 else sum
  }

  def alarmClock(day: Int, vacation: Boolean): String = {
    if (vacation) {
      if (day >= 1 && day <= 5) "10:00" else "off"
    } else {
      if (day >= 1 && day <= 5) "7:00" else "10:00"
    }
  }

  def love6(a: Int, b: Int): Boolean = {
    a == 6 || b == 6 || (a + b) == 6 || Math.abs(a - b) == 6
  }

  def in1To10(n: Int, outsideMode: Boolean): Boolean = {
    if (outsideMode) {
      n <= 1 || n >= 10
    } else {
      n >= 1 && n <= 10
    }
  }
}
