package com.codingkapoor.codingbat

object LogicI {

  def cigarParty(cigars: Int, isWeekend: Boolean) = {
    if (isWeekend) cigars >= 40 else cigars >= 40 && cigars <= 60
  }
}
