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

  def makeOutWord(out: String, word: String) = {
    out.take(2) + word + out.drop(2)
  }
}
