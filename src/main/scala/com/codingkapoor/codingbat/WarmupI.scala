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

  def front22(str: String): String = {
    str.take(2) + str + str.take(2)
  }

  def startHi(str: String): Boolean = {
    str.toLowerCase().startsWith("hi")
  }

  def icyHot(temp1: Int, temp2: Int): Boolean = {
    (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100)
  }

  def in1020(a: Int, b: Int): Boolean = {
    (a >= 10 && a <= 20) || (b >= 10 && b <= 20)
  }

  def hasTeen(a: Int, b: Int, c: Int): Boolean = {
    List(a, b, c) exists { x => x >= 13 && x <= 19 }
  }

  def loneTeen(a: Int, b: Int): Boolean = {
    List(a, b).filter(x => x >= 13 && x <= 19).size == 1
  }

  def delDel(str: String): String = {
    if (str.drop(1).startsWith("del")) str.replaceFirst("del", "") else str
  }

  def mixStart(str: String): Boolean = {
    val pattern = ".ix".r
    pattern.findPrefixMatchOf(str) match {
      case Some(_) => true
      case None    => false
    }
  }

  def startOz(str: String): String = {
    str.take(1).filter(_ == 'o') + str.drop(1).take(1).filter(_ == 'z')
  }

  def intMax(a: Int, b: Int, c: Int): Int = {
    List(a, b, c).max
  }

  def close10(a: Int, b: Int): Int = {
    val ls = List((a, Math.abs(10 - a)), (b, Math.abs(10 - b)))
    if (ls.minBy(_._2)._2 == ls.maxBy(_._2)._2) 0 else ls.minBy(_._2)._1
  }

  def in3050(a: Int, b: Int): Boolean = {
    List(a, b).forall { x => x >= 30 && x <= 40 } || List(a, b).forall { x => x >= 40 && x <= 50 }
  }

  def max1020(a: Int, b: Int): Int = {
    val max = List(a, b).max
    if (max >= 10 && max <= 20) max else 0
  }
}
