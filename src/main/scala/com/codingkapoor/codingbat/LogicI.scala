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

  def specialEleven(n: Int): Boolean = {
    n % 11 == 0 || n % 11 == 1
  }

  def more20(n: Int): Boolean = {
    n % 20 == 1 || n % 20 == 2
  }

  def old35(n: Int): Boolean = {
    (n % 3 == 0 && n % 5 != 0) || (n % 3 != 0 && n % 5 == 0)
  }

  def less20(n: Int): Boolean = {
    (n + 1) % 20 == 0 || (n + 2) % 20 == 0
  }

  def nearTen(num: Int): Boolean = {
    num % 10 == 0 || num % 10 == 1 || num % 10 == 2 || num % 10 == 8 || num % 10 == 9
  }

  def teenSum(a: Int, b: Int): Int = {
    def isTeen(x: Int) = if (x >= 13 && x <= 19) true else false

    if (isTeen(a) || isTeen(b)) 19 else a + b
  }

  def answerCell(isMorning: Boolean, isMom: Boolean, isAsleep: Boolean): Boolean = {
    if (isAsleep) false else {
      if (isMorning) {
        if (isMom) true else false
      } else true
    }
  }

  def teaParty(tea: Int, candy: Int): Int = {
    if (tea >= (candy * 2) || candy >= (tea * 2)) 2
    else if (tea >= 5 && candy >= 5) 1
    else if (tea < 5 || candy < 5) 0
    else 0
  }

  def fizzString(str: String): String = {
    val i = if (str.startsWith("f")) {
      "Fizz" + { if (str.endsWith("b")) "Buzz" else "" }
    } else if (str.endsWith("b")) { "Buzz" } else str

    i
  }

  def fizzString2(n: Int): String = {
    val res = if (n % 3 == 0 && n % 5 == 0) "FizzBuzz" else {
      if (n % 3 == 0) "Fizz" else if (n % 5 == 0) "Buzz" else s"$n"
    }

    res + "!"
  }

  def twoAsOne(a: Int, b: Int, c: Int): Boolean = {
    val ls = List(a, b, c)
    val res = ls.zip(ls.tail :+ ls.head).zip(ls.last :: ls.take(2)).filter(x => (x._1._1 + x._1._2) == x._2).size

    res > 0
  }

  def inOrder(a: Int, b: Int, c: Int, bOk: Boolean): Boolean = {
    if (bOk) {
      c > b
    } else {
      b > a && c > b
    }
  }

  def inOrderEqual(a: Int, b: Int, c: Int, equalOk: Boolean): Boolean = {
    if (equalOk) {
      c >= b && b >= a
    } else {
      c > b && b > a
    }
  }

  def lastDigit(a: Int, b: Int, c: Int): Boolean = {
    val res = List(a, b, c).map(_ % 10)
    res.zip(res.tail :+ res.head).filter(x => x._1 == x._2).size > 0
  }
}
