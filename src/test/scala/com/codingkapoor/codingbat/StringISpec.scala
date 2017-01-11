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

  """Given a string, method "left2"""" should """return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.""" in {
    StringI.left2("Hello") should equal("lloHe")
    StringI.left2("java") should equal("vaja")
    StringI.left2("Hi") should equal("Hi")
  }

  """Given a string, method "right2"""" should """return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.""" in {
    StringI.right2("Hello") should equal("loHel")
    StringI.right2("java") should equal("vaja")
    StringI.right2("Hi") should equal("Hi")
  }

  """Given a string, method "theEnd"""" should """return a string of length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.""" in {
    StringI.theEnd("Hello", true) should equal("H")
    StringI.theEnd("Hello", false) should equal("o")
    StringI.theEnd("oh", true) should equal("o")
  }

  """Given a string, method "withouEnd2"""" should """return a version without both the first and last char of the string. The string may be any length, including 0.""" in {
    StringI.withouEnd2("Hello") should equal("ell")
    StringI.withouEnd2("abc") should equal("b")
    StringI.withouEnd2("ab") should equal("")
  }

  """Given a string of even length, method "middleTwo"""" should """return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.""" in {
    StringI.middleTwo("string") should equal("ri")
    StringI.middleTwo("code") should equal("od")
    StringI.middleTwo("Practice") should equal("ct")
  }

  """Given a string, method "endsLy"""" should """return true if it ends in "ly".""" in {
    StringI.endsLy("oddly") should equal(true)
    StringI.endsLy("y") should equal(false)
    StringI.endsLy("oddy") should equal(false)
  }

  """Given a string and an int n, method "nTwice"""" should """return a string made of the first and last n chars from the string. The string length will be at least n.""" in {
    StringI.nTwice("Hello", 2) should equal("Helo")
    StringI.nTwice("Chocolate", 3) should equal("Choate")
    StringI.nTwice("Chocolate", 1) should equal("Ce")
  }

  """Given a string and an index, method "twoChar"""" should """return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.""" in {
    StringI.twoChar("java", 0) should equal("ja")
    StringI.twoChar("java", 2) should equal("va")
    StringI.twoChar("java", 3) should equal("ja")
  }

  """Given a string of odd length, method "middleThree"""" should """return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.""" in {
    StringI.middleThree("Candy") should equal("and")
    StringI.middleThree("and") should equal("and")
    StringI.middleThree("solving") should equal("lvi")
  }

  """Given a string, method "hasBad"""" should """return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.""" in {
    StringI.hasBad("badxx") should equal(true)
    StringI.hasBad("xbadxx") should equal(true)
    StringI.hasBad("xxbadxx") should equal(false)
  }

  """Given a string, method "atFirst"""" should """return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.""" in {
    StringI.atFirst("hello") should equal("he")
    StringI.atFirst("hi") should equal("hi")
    StringI.atFirst("h") should equal("h@")
  }

  """Given 2 strings, a and b, method "lastChars"""" should """return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.""" in {
    StringI.lastChars("last", "chars") should equal("ls")
    StringI.lastChars("yo", "java") should equal("ya")
    StringI.lastChars("hi", "") should equal("h@")
  }

  """Given two strings, method "conCat"""" should """append them together (known as "concatenation") and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".""" in {
    StringI.conCat("abc", "cat") should equal("abcat")
    StringI.conCat("dog", "cat") should equal("dogcat")
    StringI.conCat("abc", "") should equal("abc")
  }

  """Given a string of any length, method "lastTwo"""" should """return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".""" in {
    StringI.lastTwo("coding") should equal("codign")
    StringI.lastTwo("cat") should equal("cta")
    StringI.lastTwo("ab") should equal("ba")
  }

  """Given a string, method "seeColor"""" should """if the string begins with "red" or "blue" return that color string, otherwise return the empty string.""" in {
    StringI.seeColor("redxx") should equal("red")
    StringI.seeColor("xxred") should equal("")
    StringI.seeColor("blueTimes") should equal("blue")
  }
}
