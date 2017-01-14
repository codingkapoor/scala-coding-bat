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
}
