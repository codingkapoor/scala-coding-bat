package com.codingkapoor.codingbat

object StringI {

  def helloName(name: String): String = {
    s"Hello $name!"
  }

  def makeAbba(a: String, b: String): String = {
    a + b + b + a
  }

  def makeTags(tag: String, word: String) = {
    s"<$tag>$word</$tag>"
  }
}
