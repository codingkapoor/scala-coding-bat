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

  """Given an "out" string length 4, such as "<<>>", and a word, method "makeOutWord"""" should """return a new string where the word is in the middle of the out string, e.g. "<<word>>".""" in {
    StringI.makeOutWord("<<>>", "Yay") should equal("<<Yay>>")
    StringI.makeOutWord("<<>>", "WooHoo") should equal("<<WooHoo>>")
    StringI.makeOutWord("[[]]", "word") should equal("[[word]]")
  }

  """Given a string, method "extraEnd"""" should """return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.""" in {
    StringI.extraEnd("Hello") should equal("lololo")
    StringI.extraEnd("ab") should equal("ababab")
    StringI.extraEnd("Hi") should equal("HiHiHi")
  }

  """Given a string, method "firstTwo"""" should """return the string made of its first two chars, so the String "Hello" yields "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".""" in {
    StringI.firstTwo("Hello") should equal("He")
    StringI.firstTwo("abcdefg") should equal("ab")
    StringI.firstTwo("ab") should equal("ab")
  }

  """Given a string of even length, method "firstHalf"""" should """return the first half. So the string "WooHoo" yields "Woo".""" in {
    StringI.firstHalf("WooHoo") should equal("Woo")
    StringI.firstHalf("HelloThere") should equal("Hello")
    StringI.firstHalf("abcdef") should equal("abc")
  }

  """Given a string, method "withoutEnd"""" should """return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.""" in {
    StringI.withoutEnd("Hello") should equal("ell")
    StringI.withoutEnd("java") should equal("av")
    StringI.withoutEnd("coding") should equal("odin")
  }

  """Given 2 strings, a and b, method "comboString"""" should """return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).""" in {
    StringI.comboString("Hello", "hi") should equal("hiHellohi")
    StringI.comboString("hi", "Hello") should equal("hiHellohi")
    StringI.comboString("aaa", "b") should equal("baaab")
  }

  """Given 2 strings, method "nonStart"""" should """return their concatenation, except omit the first char of each. The strings will be at least length 1.""" in {
    StringI.nonStart("Hello", "There") should equal("ellohere")
    StringI.nonStart("java", "code") should equal("avaode")
    StringI.nonStart("shotl", "java") should equal("hotlava")
  }
}
