package com.codingkapoor.codingbat

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class StringISpec extends FlatSpec with Matchers {
  """Given a string name, e.g. "Bob", method "helloName"""" should """return a greeting of the form "Hello Bob!".""" in {
    StringI.helloName("Bob") should equal("Hello Bob!")
    StringI.helloName("Alice") should equal("Hello Alice!")
    StringI.helloName("X") should equal("Hello X!")
  }

  """Given two strings, a and b, method "makeAbba"""" should """return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".""" in {
    StringI.makeAbba("Hi", "Bye") should equal("HiByeByeHi")
    StringI.makeAbba("Yo", "Alice") should equal("YoAliceAliceYo")
    StringI.makeAbba("What", "Up") should equal("WhatUpUpWhat")
  }

  """Given tag and word strings, method "makeTags"""" should """create the HTML string with tags around the word, e.g. "<i>Yay</i>".""" in {
    StringI.makeTags("i", "Yay") should equal("<i>Yay</i>")
    StringI.makeTags("i", "Hello") should equal("<i>Hello</i>")
    StringI.makeTags("cite", "Yay") should equal("<cite>Yay</cite>")
  }
}
