package com.codingkapoor.codingbat

object StringI {

  def helloName(name: String): String = {
    s"Hello $name!"
  }

  def makeAbba(a: String, b: String): String = {
    a + b + b + a
  }

  def makeTags(tag: String, word: String): String = {
    s"<$tag>$word</$tag>"
  }

  def makeOutWord(out: String, word: String): String = {
    out.take(2) + word + out.drop(2)
  }

  def extraEnd(str: String): String = {
    str.drop(str.length() - 2) * 3
  }

  def firstTwo(str: String): String = {
    str.take(2)
  }

  def firstHalf(str: String): String = {
    str.take(str.length() / 2)
  }

  def withoutEnd(str: String): String = {
    str.tail.init
  }

  def comboString(a: String, b: String): String = {
    if (b.length() < a.length()) b + a + b
    else a + b + a
  }

  def nonStart(a: String, b: String): String = {
    a.tail + b.tail
  }

  def left2(str: String): String = {
    str.drop(2) + str.take(2)
  }

  def right2(str: String): String = {
    str.drop(str.length() - 2) + str.init.init
  }

  def theEnd(str: String, front: Boolean): String = {
    if (front) str.take(1) else str.drop(str.length() - 1)
  }

  def withouEnd2(str: String): String = {
    str.tail.init
  }

  def middleTwo(str: String): String = {
    val center = str.length() / 2
    str.substring(center - 1, center + 1)
  }

  def endsLy(str: String): Boolean = {
    if (str.length() > 1) s"${str.init.last}${str.last}".equals("ly") else false
  }

  def nTwice(str: String, n: Int): String = {
    str.take(n) + str.drop(str.length() - n)
  }

  /* 
   * This implementation also takes care of mapping given 'index' parameter 
   * circularly to the indexes of the string provided.  
   *
   * s : 0 : 5 : 10 : 15
   * c : 1 : 6 : 11 : 16
   * a : 2 : 7 : 12 : 17
   * l : 3 : 8 : 13 : 18
   * a : 4 : 9 : 14 : 19
  */
  def twoChar(str: String, index: Int): String = {
    val res = index % str.length()
    val start = if (str.length() - res < 2) 0 else res

    str.substring(start).take(2)
  }

  def middleThree(str: String): String = {
    if (str.length() < 3 || str.length() == 3) str else {
      val mid = Math.abs(str.length / 2)
      str.substring(mid - 1, mid + 2)
    }
  }

  def hasBad(str: String): Boolean = {
    str.take(3) == "bad" || str.drop(1).take(3) == "bad"
  }

  def atFirst(str: String): String = {
    if (str.length() < 2) str + "@" else str.take(2)
  }

  def lastChars(a: String, b: String): String = {
    // (if (a.length() < 1) "@" else a.take(1)) + (if (b.length() < 1) "@" else b.last) 
    s"${if (a.length() < 1) "@" else a.take(1)}${if (b.length() < 1) "@" else b.last}"
  }

  def conCat(a: String, b: String): String = {
    if (a.last.toString == b.take(1)) a + b.drop(1) else a + b
  }

  def lastTwo(str: String): String = {
    str.take(str.length() - 2) + str.drop(str.length() - 2).reverse
  }

  def seeColor(str: String): String = {
    if (str.startsWith("red")) "red" else if(str.startsWith("blue")) "blue" else ""
  }
}
