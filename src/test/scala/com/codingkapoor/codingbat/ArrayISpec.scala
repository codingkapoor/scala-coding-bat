package com.codingkapoor.codingbat

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class ArrayISpec extends FlatSpec with Matchers {

  """Given an array of ints, method "firstLast6"""" should """return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.""" in {
    ArrayI.firstLast6(Array(1, 2, 6)) should equal(true)
    ArrayI.firstLast6(Array(6, 1, 2, 3)) should equal(true)
    ArrayI.firstLast6(Array(13, 6, 1, 2, 3)) should equal(false)
  }

  """Given an array of ints, method "sameFirstLast"""" should """return true if the array is length 1 or more, and the first element and the last element are equal.""" in {
    ArrayI.sameFirstLast(Array(1, 2, 3)) should equal(false)
    ArrayI.sameFirstLast(Array(1, 2, 3, 1)) should equal(true)
    ArrayI.sameFirstLast(Array(1, 2, 1)) should equal(true)
  }

  """Method "makePi"""" should """return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.""" in {
    ArrayI.makePi() should equal(Array(3, 1, 4))
  }

  """Given 2 arrays of ints, a and b, method "commonEnd"""" should """return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.""" in {
    ArrayI.commonEnd(Array(1, 2, 3), Array(7, 3)) should equal(true)
    ArrayI.commonEnd(Array(1, 2, 3), Array(7, 3, 2)) should equal(false)
    ArrayI.commonEnd(Array(1, 2, 3), Array(1, 3)) should equal(true)
  }

  """Given an array of ints length 3, method "sum3"""" should """return the sum of all the elements.""" in {
    ArrayI.sum3(Array(1, 2, 3)) should equal(6)
    ArrayI.sum3(Array(5, 11, 2)) should equal(18)
    ArrayI.sum3(Array(7, 0, 0)) should equal(7)
  }

  """Given an array of ints length 3, method "rotateLeft3"""" should """return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.""" in {
    ArrayI.rotateLeft3(Array(1, 2, 3)) should equal(Array(2, 3, 1))
    ArrayI.rotateLeft3(Array(5, 11, 9)) should equal(Array(11, 9, 5))
    ArrayI.rotateLeft3(Array(7, 0, 0)) should equal(Array(0, 0, 7))
  }

  """Given an array of ints length 3, method "reverse3"""" should """return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.""" in {
    ArrayI.reverse3(Array(1, 2, 3)) should equal(Array(3, 2, 1))
    ArrayI.reverse3(Array(5, 11, 9)) should equal(Array(9, 11, 5))
    ArrayI.reverse3(Array(7, 0, 0)) should equal(Array(0, 0, 7))
  }

  """Given an array of ints length 3, method "maxEnd3"""" should """figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.""" in {
    ArrayI.maxEnd3(Array(1, 2, 3)) should equal(Array(3, 3, 3))
    ArrayI.maxEnd3(Array(11, 5, 9)) should equal(Array(11, 11, 11))
    ArrayI.maxEnd3(Array(2, 11, 3)) should equal(Array(3, 3, 3))
  }

  """Given an array of ints, method "sum2"""" should """return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.""" in {
    ArrayI.sum2(Array(1, 2, 3)) should equal(3)
    ArrayI.sum2(Array(1, 1)) should equal(2)
    ArrayI.sum2(Array(1, 1, 1, 1)) should equal(2)
    ArrayI.sum2(Array()) should equal(0)
    ArrayI.sum2(Array(1)) should equal(1)
  }

  """Given 2 int arrays, a and b, each length 3, method "middleWay"""" should """return a new array length 2 containing their middle elements.""" in {
    ArrayI.middleWay(Array(1, 2, 3), Array(4, 5, 6)) should equal(Array(2, 5))
    ArrayI.middleWay(Array(7, 7, 7), Array(3, 8, 0)) should equal(Array(7, 8))
    ArrayI.middleWay(Array(5, 2, 9), Array(1, 4, 5)) should equal(Array(2, 4))
  }

  """Given an array of ints, method "makeEnds"""" should """return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.""" in {
    ArrayI.makeEnds(Array(1, 2, 3)) should equal(Array(1, 3))
    ArrayI.makeEnds(Array(1, 2, 3, 4)) should equal(Array(1, 4))
    ArrayI.makeEnds(Array(7, 4, 6, 2)) should equal(Array(7, 2))
  }

  """Given an int array length 2, method "has23"""" should """return true if it contains a 2 or a 3.""" in {
    ArrayI.has23(Array(2, 5)) should equal(true)
    ArrayI.has23(Array(4, 3)) should equal(true)
    ArrayI.has23(Array(4, 5)) should equal(false)
  }

  """Given an int array length 2, method "no23"""" should """return true if it does not contain a 2 or 3.""" in {
    ArrayI.no23(Array(4, 5)) should equal(true)
    ArrayI.no23(Array(4, 2)) should equal(false)
    ArrayI.no23(Array(3, 5)) should equal(false)
  }

  """Given an int array, method "makeLast"""" should """return a new array with double the length where its last element is the same as the original array, and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.""" in {
    ArrayI.makeLast(Array(4, 5, 6)) should equal(Array(0, 0, 0, 0, 0, 6))
    ArrayI.makeLast(Array(1, 2)) should equal(Array(0, 0, 0, 2))
    ArrayI.makeLast(Array(3)) should equal(Array(0, 3))
  }

  """Given an int array, method "double23"""" should """return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.""" in {
    ArrayI.double23(Array(2, 2)) should equal(true)
    ArrayI.double23(Array(3, 3)) should equal(true)
    ArrayI.double23(Array(2, 3)) should equal(false)
  }

  """Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Method "fix23"""" should "return the changed array." in {
    ArrayI.fix23(Array(1, 2, 3)) should equal(Array(1, 2, 0))
    ArrayI.fix23(Array(2, 3, 5)) should equal(Array(2, 0, 5))
    ArrayI.fix23(Array(1, 2, 1)) should equal(Array(1, 2, 1))
  }

  """Start with 2 int arrays, a and b, of any length. Method "start1"""" should """return how many of the arrays have 1 as their first element.""" in {
    ArrayI.start1(Array(1, 2, 3), Array(1, 3)) should equal(2)
    ArrayI.start1(Array(7, 2, 3), Array(1)) should equal(1)
    ArrayI.start1(Array(1, 2), Array()) should equal(1)
  }

  """Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Method "biggerTwo"""" should """return the array which has the largest sum. In event of a tie, return a.""" in {
    ArrayI.biggerTwo(Array(1, 2), Array(3, 4)) should equal(Array(3, 4))
    ArrayI.biggerTwo(Array(3, 4), Array(1, 2)) should equal(Array(3, 4))
    ArrayI.biggerTwo(Array(1, 1), Array(1, 2)) should equal(Array(1, 2))
  }

  """Given an array of ints of even length, method """"" should """return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.""" in {
    ArrayI.makeMiddle(Array(1, 2, 3, 4)) should equal(Array(2, 3))
    ArrayI.makeMiddle(Array(7, 1, 2, 3, 4, 9)) should equal(Array(2, 3))
    ArrayI.makeMiddle(Array(1, 2)) should equal(Array(1, 2))
  }

  """Given 2 int arrays, each length 2, method "plusTwo"""" should """return a new array length 4 containing all their elements.""" in {
    ArrayI.plusTwo(Array(1, 2), Array(3, 4)) should equal(Array(1, 2, 3, 4))
    ArrayI.plusTwo(Array(4, 4), Array(2, 2)) should equal(Array(4, 4, 2, 2))
    ArrayI.plusTwo(Array(9, 2), Array(3, 4)) should equal(Array(9, 2, 3, 4))
  }

  """Given an array of ints, method "swapEnds"""" should """swap the first and last elements in the array. Return the modified array. The array length will be at least 1.""" in {
    ArrayI.swapEnds(Array(1, 2, 3, 4)) should equal(Array(4, 2, 3, 1))
    ArrayI.swapEnds(Array(1, 2, 3)) should equal(Array(3, 2, 1))
    ArrayI.swapEnds(Array(8, 6, 7, 9, 5)) should equal(Array(5, 6, 7, 9, 8))
  }
}
