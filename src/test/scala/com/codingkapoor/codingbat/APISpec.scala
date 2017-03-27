package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class APISpec extends FlatSpec with Matchers {

  """Given an array of scores, method "scoresIncreasing"""" should """return true if each score is equal or greater than the one before. The array will be length 2 or more.""" in {
    API.scoresIncreasing(Array(1, 3, 4)) should equal(true)
    API.scoresIncreasing(Array(1, 3, 2)) should equal(false)
    API.scoresIncreasing(Array(1, 1, 4)) should equal(true)
  }

  """Given an array of scores, method """"" should """return true if there are scores of 100 next to each other in the array. The array length will be at least 2.""" in {
    API.scores100(Array(1, 100, 100)) should equal(true)
    API.scores100(Array(1, 100, 99, 100)) should equal(false)
    API.scores100(Array(100, 1, 100, 100)) should equal(true)
  }

  """Given an array of scores sorted in increasing order, method "scoresClump"""" should """return true if the array contains 3 adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.""" in {
    API.scoresClump(Array(3, 4, 5)) should equal(true)
    API.scoresClump(Array(3, 4, 6)) should equal(false)
    API.scoresClump(Array(1, 3, 5, 5)) should equal(true)
  }

  """Given an array of strings, method "wordsCount"""" should """return the count of the number of strings with the given length.""" in {
    API.wordsCount(Array("a", "bb", "b", "ccc"), 1) should equal(2)
    API.wordsCount(Array("a", "bb", "b", "ccc"), 3) should equal(1)
    API.wordsCount(Array("a", "bb", "b", "ccc"), 4) should equal(0)
  }

  """Given an array of strings, method "wordsFront"""" should """return a new array containing the first N strings. N will be in the range 1..length.""" in {
    API.wordsFront(Array("a", "b", "c", "d"), 1) should equal(Array("a"))
    API.wordsFront(Array("a", "b", "c", "d"), 2) should equal(Array("a", "b"))
    API.wordsFront(Array("a", "b", "c", "d"), 3) should equal(Array("a", "b", "c"))
  }

  """Given an array of strings, method "wordsWithoutList"""" should """return a new List (e.g. an ArrayList) where all the strings of the given length are omitted.""" in {
    API.wordsWithoutList(Array("a", "bb", "b", "ccc"), 1) should equal(Array("bb", "ccc"))
    API.wordsWithoutList(Array("a", "bb", "b", "ccc"), 3) should equal(Array("a", "bb", "b"))
    API.wordsWithoutList(Array("a", "bb", "b", "ccc"), 4) should equal(Array("a", "bb", "b", "ccc"))
  }

  """Given a positive int n, method "hasOne"""" should """return true if it contains a 1 digit. Note: use % to get the rightmost digit, and / to discard the rightmost digit.""" in {
    API.hasOne(10) should equal(true)
    API.hasOne(22) should equal(false)
    API.hasOne(220) should equal(false)
  }

  """We'll say that a positive int divides itself if every digit in the number divides into the number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself. Method "dividesSelf"""" should """should find whether a given number divides itself.""" in {
    API.dividesSelf(128) should equal(true)
    API.dividesSelf(12) should equal(true)
    API.dividesSelf(120) should equal(false)
  }

}
