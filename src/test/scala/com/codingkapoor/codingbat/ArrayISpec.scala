package com.codingkapoor.codingbat

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class ArrayISpec extends FlatSpec with Matchers {

  """Given an array of ints, method """"" should """return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.""" in {
    ArrayI.firstLast6(Array(1, 2, 6)) should equal(true)
    ArrayI.firstLast6(Array(6, 1, 2, 3)) should equal(true)
    ArrayI.firstLast6(Array(13, 6, 1, 2, 3)) should equal(false)
  }

  """Given an array of ints, method """"" should """return true if the array is length 1 or more, and the first element and the last element are equal.""" in {
    ArrayI.sameFirstLast(Array(1, 2, 3)) should equal(false)
    ArrayI.sameFirstLast(Array(1, 2, 3, 1)) should equal(true)
    ArrayI.sameFirstLast(Array(1, 2, 1)) should equal(true)
  }

  """Method "makePi"""" should """return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.""" in {
    ArrayI.makePi() should equal(Array(3, 1, 4))
  }
}