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

}
