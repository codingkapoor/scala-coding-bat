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
    val res = str.init.last.toString() + str.last.toString()
    res.equals("ly")
  }
  
}
