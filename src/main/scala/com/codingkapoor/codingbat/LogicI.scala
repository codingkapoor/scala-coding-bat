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
}
