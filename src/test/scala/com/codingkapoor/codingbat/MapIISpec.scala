package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class MapIISpec extends FlatSpec with Matchers {

  """Given an array of strings, method "word0"""" should """return a Map<String, Integer> containing a key for every different string in the array, always with the value 0.""" in {
    MapII.word0(List("a", "b", "a", "b")) should equal(Map("a" -> 0, "b" -> 0))
    MapII.word0(List("a", "b", "a", "c", "b")) should equal(Map("a" -> 0, "b" -> 0, "c" -> 0))
    MapII.word0(List("c", "b", "a")) should equal(Map("a" -> 0, "b" -> 0, "c" -> 0))

    MapII.word0II(List("a", "b", "a", "b")) should equal(Map("a" -> 0, "b" -> 0))
    MapII.word0II(List("a", "b", "a", "c", "b")) should equal(Map("a" -> 0, "b" -> 0, "c" -> 0))
    MapII.word0II(List("c", "b", "a")) should equal(Map("a" -> 0, "b" -> 0, "c" -> 0))

    MapII.word0III(List("a", "b", "a", "b")) should equal(Map("a" -> 0, "b" -> 0))
    MapII.word0III(List("a", "b", "a", "c", "b")) should equal(Map("a" -> 0, "b" -> 0, "c" -> 0))
    MapII.word0III(List("c", "b", "a")) should equal(Map("a" -> 0, "b" -> 0, "c" -> 0))
  }

  """Given an array of strings, method "wordLen"""" should """return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length.""" in {
    MapII.wordLen(List("a", "bb", "a", "bb")) should equal(Map("bb" -> 2, "a" -> 1))
    MapII.wordLen(List("this", "and", "that", "and")) should equal(Map("that" -> 4, "and" -> 3, "this" -> 4))
    MapII.wordLen(List("code", "code", "code", "bug")) should equal(Map("code" -> 4, "bug" -> 3))
  }

  """Given an array of non-empty strings, method "pairs"""" should """create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value.""" in {
    MapII.pairs(List("code", "bug")) should equal(Map("b" -> "g", "c" -> "e"))
    MapII.pairs(List("man", "moon", "main")) should equal(Map("m" -> "n"))
    MapII.pairs(List("man", "moon", "good", "night")) should equal(Map("g" -> "d", "m" -> "n", "n" -> "t"))
  }

  """Given an array of strings, method "wordCount"""" should """return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array.""" in {
    MapII.wordCount(List("a", "b", "a", "c", "b")) should equal(Map("a" -> 2, "b" -> 2, "c" -> 1))
    MapII.wordCount(List("c", "b", "a")) should equal(Map("a" -> 1, "b" -> 1, "c" -> 1))
    MapII.wordCount(List("c", "c", "c", "c")) should equal(Map("c" -> 4))
  }

  """Given an array of non-empty strings, method "firstChar"""" should """return a Map<String, String> with a key for every different first character seen, with the value of all the strings starting with that character appended together in the order they appear in the array.""" in {
    MapII.firstChar(List("salt", "tea", "soda", "toast")) should equal(Map('s' -> "saltsoda", 't' -> "teatoast"))
    MapII.firstChar(List("aa", "bb", "cc", "aAA", "cCC", "d")) should equal(Map('a' -> "aaaAA", 'b' -> "bb", 'c' -> "cccCC", 'd' -> "d"))
    MapII.firstChar(List()) → Map()
  }

  """Method "wordAppend"""" should """loop over the given array of strings to build a result string like this: when a string appears the 2nd, 4th, 6th, etc. time in the array, append the string to the result. Return the empty string if no string appears a 2nd time.""" in {
    MapII.wordAppend(List("a", "b", "a")) should equal("a")
    MapII.wordAppend(List("a", "b", "a", "c", "a", "d", "a")) should equal("aa")
    MapII.wordAppend(List("a", "b", "a", "c", "a", "d", "a", "b")) should equal("baa")
    MapII.wordAppend(List("a", "", "a")) should equal("a")
  }

  """Given an array of strings, method "wordMultiple""" should """return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array.""" in {
    MapII.wordMultiple(List("a", "b", "a", "c", "b")) should equal(Map("a" -> true, "b" -> true, "c" -> false))
    MapII.wordMultiple(List("c", "b", "a")) should equal(Map("a" -> false, "b" -> false, "c" -> false))
    MapII.wordMultiple(List("c", "c", "c", "c")) should equal(Map("c" -> true))
  }

  """We'll say that 2 strings "match" if they are non-empty and their first chars are the same. Method "allSwap"""" should """loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array. When a position in the array has been swapped, it no longer matches anything.""" in {
    MapII.allSwap(List("ab", "ac")) should equal(List("ac", "ab"))
    MapII.allSwap(List("ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz")) should equal(List("ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"))
    MapII.allSwap(List("ax", "bx", "ay", "by", "ai", "aj", "bx", "by")) should equal(List("ay", "by", "ax", "bx", "aj", "ai", "by", "bx"))
  }

}
