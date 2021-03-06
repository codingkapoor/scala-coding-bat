package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class ArrayIIISpec extends FlatSpec with Matchers {
  """Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Method "maxSpan"""" should """returns the largest span found in the given array.""" in {
    ArrayIII.maxSpan(Array(1, 2, 1, 1, 3)) should equal(4)
    ArrayIII.maxSpan(Array(1, 4, 2, 1, 4, 1, 4)) should equal(6)
    ArrayIII.maxSpan(Array(1, 4, 2, 1, 4, 4, 4)) should equal(6)
  }

  """Method fix34""" should """return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move. The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.""" in {
    ArrayIII.fix34(Array(1, 3, 4, 1)) should equal(Array(1, 3, 4, 1))
    ArrayIII.fix34(Array(1, 3, 1, 4, 4, 3, 1)) should equal(Array(1, 3, 4, 1, 1, 3, 4))
    ArrayIII.fix34(Array(3, 2, 2, 4)) should equal(Array(3, 4, 2, 2))
  }

  """Method "fix45"""" should """return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.""" in {
    ArrayIII.fix45(Array(5, 4, 9, 4, 9, 5)) should equal(Array(9, 4, 5, 4, 5, 9))
    ArrayIII.fix45(Array(1, 4, 1, 5)) should equal(Array(1, 4, 5, 1))
    ArrayIII.fix45(Array(1, 4, 1, 5, 5, 4, 1)) should equal(Array(1, 4, 5, 1, 1, 4, 5))
  }

  """Given a non-empty array, method "canBalance"""" should """return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.""" in {
    ArrayIII.canBalance(Array(1, 1, 1, 2, 1)) should equal(true)
    ArrayIII.canBalance(Array(2, 1, 1, 2, 1)) should equal(false)
    ArrayIII.canBalance(Array(10, 10)) should equal(true)
  }

  """Given two arrays of ints sorted in increasing order, outer and inner, method "linearIn"""" should """eturn true if all of the numbers in inner appear in outer.""" in {
    ArrayIII.linearIn(Array(1, 2, 4, 6), Array(2, 4)) should equal(true)
    ArrayIII.linearIn(Array(1, 2, 4, 6), Array(2, 3, 4)) should equal(false)
    ArrayIII.linearIn(Array(1, 2, 4, 4, 6), Array(2, 4)) should equal(true)
  }

  """Given n>=0, method "squareUp"""" should """create an array length n*n with the following pattern, shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1}""" in {
    ArrayIII.squareUp(3) should equal(Array(0, 0, 1, 0, 2, 1, 3, 2, 1))
    ArrayIII.squareUp(2) should equal(Array(0, 1, 2, 1))
    ArrayIII.squareUp(4) should equal(Array(0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1))
  }

  """Given n>=0, method "seriesUp"""" should """create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the grouping).""" in {
    ArrayIII.seriesUp(3) should equal(Array(1, 1, 2, 1, 2, 3))
    ArrayIII.seriesUp(4) should equal(Array(1, 1, 2, 1, 2, 3, 1, 2, 3, 4))
    ArrayIII.seriesUp(2) should equal(Array(1, 1, 2))
  }

  """We'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. Method "maxMirror"""" should """return the size of the largest mirror section found in the given array.""" in {
    ArrayIII.maxMirror(Array(1, 2, 3, 8, 9, 3, 2, 1)) should equal(3)
    ArrayIII.maxMirror(Array(1, 2, 1, 4)) should equal(3)
    ArrayIII.maxMirror(Array(7, 1, 2, 9, 7, 2, 1)) should equal(2)
  }

  """Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Method "countClumps"""" should """return the number of clumps in the given array.""" in {
    ArrayIII.countClumps(Array(1, 2, 2, 3, 4, 4)) should equal(2)
    ArrayIII.countClumps(Array(1, 1, 2, 1, 1)) should equal(2)
    ArrayIII.countClumps(Array(1, 1, 1, 1, 1)) should equal(1)
  }
}
