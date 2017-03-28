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

  """Given an array of scores, method "scoresAverage """" should """compute the int average of the first half and the second half, and return whichever is larger.""" in {
    API.scoresAverage(Array(2, 2, 4, 4)) should equal(4)
    API.scoresAverage(Array(4, 4, 4, 2, 2, 2)) should equal(4)
    API.scoresAverage(Array(3, 4, 5, 1, 2, 3)) should equal(4)
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

  """Given an array of positive ints, method "copyEvens"""" should """return a new array of length "count" containing the first even numbers from the original array. The original array will contain at least "count" even numbers.""" in {
    API.copyEvens(Array(3, 2, 4, 5, 8), 2) should equal(Array(2, 4))
    API.copyEvens(Array(3, 2, 4, 5, 8), 3) should equal(Array(2, 4, 8))
    API.copyEvens(Array(6, 1, 2, 4, 5, 8), 3) should equal(Array(6, 2, 4))
  }

  """We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive). Given an array of positive ints, method "copyEndy"""" should """return a new array of length "count" containing the first endy numbers from the original array. The original array will contain at least "count" endy numbers.""" in {
    API.copyEndy(Array(9, 11, 90, 22, 6), 2) should equal(Array(9, 90))
    API.copyEndy(Array(9, 11, 90, 22, 6), 3) should equal(Array(9, 90, 6))
    API.copyEndy(Array(12, 1, 1, 13, 0, 20), 2) should equal(Array(1, 1))
  }

  """Given 2 arrays that are the same length containing strings, method "matchUp"""" should """compares the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on and then counts the number of times that the 2 strings are non-empty and start with the same char. The strings may be any length, including 0.""" in {
    API.matchUp(Array("aa", "bb", "cc"), Array("aaa", "xx", "bb")) should equal(1)
    API.matchUp(Array("aa", "bb", "cc"), Array("aaa", "b", "bb")) should equal(2)
    API.matchUp(Array("aa", "bb", "cc"), Array("", "", "ccc")) should equal(1)
  }

  """The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, with "?" representing a question left blank. The two arrays are not empty and are the same length. Method "scoreUp"""" should """return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.""" in {
    API.scoreUp(Array("a", "a", "b", "b"), Array("a", "c", "b", "c")) should equal(6)
    API.scoreUp(Array("a", "a", "b", "b"), Array("a", "a", "b", "c")) should equal(11)
    API.scoreUp(Array("a", "a", "b", "b"), Array("a", "a", "b", "b")) should equal(16)
  }

  """Given an array of strings, method "wordsWithout"""" should """return a new array without the strings that are equal to the target string.""" in {
    API.wordsWithout(Array("a", "b", "c", "a"), "a") should equal(Array("b", "c"))
    API.wordsWithout(Array("a", "b", "c", "a"), "b") should equal(Array("a", "c", "a"))
    API.wordsWithout(Array("a", "b", "c", "a"), "c") should equal(Array("a", "b", "a"))
  }

  """Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10, such as 40 or 90. Method "scoresSpecial"""" should """return the sum of largest special score in A and the largest special score in B.""" in {
    API.scoresSpecial(Array(12, 10, 4), Array(2, 20, 30)) should equal(40)
    API.scoresSpecial(Array(20, 10, 4), Array(2, 20, 10)) should equal(40)
    API.scoresSpecial(Array(12, 11, 4), Array(2, 20, 31)) should equal(20)
  }

  """We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, method "sumHeights"""" should """return the sum of the changes for a walk beginning at the start index and ending at the end index.""" in {
    API.sumHeights(Array(5, 3, 6, 7, 2), 2, 4) should equal(6)
    API.sumHeights(Array(5, 3, 6, 7, 2), 0, 1) should equal(2)
    API.sumHeights(Array(5, 3, 6, 7, 2), 0, 4) should equal(11)
  }

  """We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, method "sumHeights2"""" should """return the sum of the changes for a walk beginning at the start index and ending at the end index, however increases in height count double.""" in {
    API.sumHeights2(Array(5, 3, 6, 7, 2), 2, 4) should equal(7)
    API.sumHeights2(Array(5, 3, 6, 7, 2), 0, 1) should equal(2)
    API.sumHeights2(Array(5, 3, 6, 7, 2), 0, 4) should equal(15)
  }

  """We have an array of heights, representing the altitude along a walking trail. Given start/end indexes into the array, method "bigHeights"""" should """ return the number of "big" steps for a walk starting at the start index and ending at the end index.""" in {
    API.bigHeights(Array(5, 3, 6, 7, 2), 2, 4) should equal(1)
    API.bigHeights(Array(5, 3, 6, 7, 2), 0, 1) should equal(0)
    API.bigHeights(Array(5, 3, 6, 7, 2), 0, 4) should equal(1)
  }

  """Start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates. Method "mergeTwo"""" should """return a new array containing the first N elements from the two arrays. The result array should be in alphabetical order and without duplicates.""" in {
    API.mergeTwo(Array("a", "c", "z"), Array("b", "f", "z"), 3) should equal(Array("a", "b", "c"))
    API.mergeTwo(Array("a", "c", "z"), Array("c", "f", "z"), 3) should equal(Array("a", "c", "f"))
    API.mergeTwo(Array("f", "g", "z"), Array("c", "f", "g"), 3) should equal(Array("c", "f", "g"))
  }

  """Start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates. Method "commonTwo"""" should """return the count of the number of strings which appear in both arrays.""" in {
    API.commonTwo(Array("a", "c", "x"), Array("b", "c", "d", "x")) should equal(2)
    API.commonTwo(Array("a", "c", "x"), Array("a", "b", "c", "x", "z")) should equal(3)
    API.commonTwo(Array("a", "b", "c"), Array("a", "b", "c")) should equal(3)
  }

}
