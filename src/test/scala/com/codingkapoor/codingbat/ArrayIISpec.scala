package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class ArrayIISpec extends FlatSpec with Matchers {

  """Method "countEvens"""" should """return the number of even ints in the given array.""" in {
    ArrayII.countEvens(Array(2, 1, 2, 3, 4)) should equal(3)
    ArrayII.countEvens(Array(2, 2, 0)) should equal(3)
    ArrayII.countEvens(Array(1, 3, 5)) should equal(0)
  }

  """Given an array length 1 or more of ints, method "bigDiff"""" should """return the difference between the largest and smallest values in the array.""" in {
    ArrayII.bigDiff(Array(10, 3, 5, 6)) should equal(7)
    ArrayII.bigDiff(Array(7, 2, 10, 9)) should equal(8)
    ArrayII.bigDiff(Array(2, 10, 7, 2)) should equal(8)
  }

  """""" should """""" in {
    ArrayII.centeredAverage(Array(1, 2, 3, 4, 100)) should equal(3)
    ArrayII.centeredAverage(Array(1, 1, 5, 5, 10, 8, 7)) should equal(5)
    ArrayII.centeredAverage(Array(-10, -4, -2, -4, -2, 0)) should equal(-3)
  }

  """Method "sum13"""" should """return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.""" in {
    ArrayII.sum13(Array(1, 2, 2, 1)) should equal(6)
    ArrayII.sum13(Array(1, 1)) should equal(2)
    ArrayII.sum13(Array(1, 2, 2, 1, 13)) should equal(6)
  }

  """Method "sum67"""" should """return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7). Return 0 for no numbers.""" in {
    ArrayII.sum67(Array(1, 2, 2)) should equal(5)
    ArrayII.sum67(Array(1, 2, 2, 6, 99, 99, 7)) should equal(5)
    ArrayII.sum67(Array(1, 1, 6, 7, 2)) should equal(4)
  }

  """Given an array of ints, method "has22"""" should """return true if the array contains a 2 next to a 2 somewhere.""" in {
    ArrayII.has22(Array(1, 2, 2)) should equal(true)
    ArrayII.has22(Array(1, 2, 1, 2)) should equal(false)
    ArrayII.has22(Array(2, 1, 2)) should equal(false)
  }

  """Given an array of ints, method "lucky13"""" should """return true if the array contains no 1's and no 3's.""" in {
    ArrayII.lucky13(Array(0, 2, 4)) should equal(true)
    ArrayII.lucky13(Array(1, 2, 3)) should equal(false)
    ArrayII.lucky13(Array(1, 2, 4)) should equal(false)
  }

  """Given an array of ints, method "sum28"""" should """return true if the sum of all the 2's in the array is exactly 8.""" in {
    ArrayII.sum28(Array(2, 3, 2, 2, 4, 2)) should equal(true)
    ArrayII.sum28(Array(2, 3, 2, 2, 4, 2, 2)) should equal(false)
    ArrayII.sum28(Array(1, 2, 3, 4)) should equal(false)
  }

  """Given an array of ints, method "more14"""" should """return true if the number of 1's is greater than the number of 4's""" in {
    ArrayII.more14(Array(1, 4, 1)) should equal(true)
    ArrayII.more14(Array(1, 4, 1, 4)) should equal(false)
    ArrayII.more14(Array(1, 1)) should equal(true)
  }

  """Given a number n, method "fizzArray"""" should """create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. The given n may be 0, in which case just return a length 0 array.""" in {
    ArrayII.fizzArray(4) should equal(Array(0, 1, 2, 3))
    ArrayII.fizzArray(1) should equal(Array(0))
    ArrayII.fizzArray(10) should equal(Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9))
  }

  """Given an array of ints, method "only14"""" should """return true if every element is a 1 or a 4.""" in {
    ArrayII.only14(Array(1, 4, 1, 4)) should equal(true)
    ArrayII.only14(Array(1, 4, 2, 4)) should equal(false)
    ArrayII.only14(Array(1, 1)) should equal(true)
  }

  """Given a number n, method "fizzArray2"""" should """create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1. N may be 0, in which case just return a length 0 array.""" in {
    ArrayII.fizzArray2(4) should equal(Array("0", "1", "2", "3"))
    ArrayII.fizzArray2(10) should equal(Array("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"))
    ArrayII.fizzArray2(2) should equal(Array("0", "1"))
  }

  """Given an array of ints, method "no14"""" should """return true if it contains no 1's or it contains no 4's.""" in {
    ArrayII.no14(Array(1, 2, 3)) should equal(true)
    ArrayII.no14(Array(1, 2, 3, 4)) should equal(false)
    ArrayII.no14(Array(2, 3, 4)) should equal(true)
  }

  """We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value. Method "isEverywhere"""" should """return true if the given value is everywhere in the array.""" in {
    ArrayII.isEverywhere(Array(1, 2, 1, 3), 1) should equal(true)
    ArrayII.isEverywhere(Array(1, 2, 1, 3), 2) should equal(false)
    ArrayII.isEverywhere(Array(1, 2, 1, 3, 4), 1) should equal(false)
  }

  """Given an array of ints, method "either24"""" should """return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.""" in {
    ArrayII.either24(Array(1, 2, 2)) should equal(true)
    ArrayII.either24(Array(4, 4, 1)) should equal(true)
    ArrayII.either24(Array(4, 4, 1, 2, 2)) should equal(false)
  }

  """Given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index). Method "matchUp"""" should """return the count of the number of times that the two elements differ by 2 or less, but are not equal.""" in {
    ArrayII.matchUp(Array(1, 2, 3), Array(2, 3, 10)) should equal(2)
    ArrayII.matchUp(Array(1, 2, 3), Array(2, 3, 5)) should equal(3)
    ArrayII.matchUp(Array(1, 2, 3), Array(2, 3, 3)) should equal(2)
  }

  """Given an array of ints, method "has77"""" should """return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.""" in {
    ArrayII.has77(Array(1, 7, 7)) should equal(true)
    ArrayII.has77(Array(1, 7, 1, 7)) should equal(true)
    ArrayII.has77(Array(1, 7, 1, 1, 7)) should equal(false)
  }

  """Given an array of ints, method "has12"""" should """return true if there is a 1 in the array with a 2 somewhere later in the array.""" in {
    ArrayII.has12(Array(1, 3, 2)) should equal(true)
    ArrayII.has12(Array(3, 1, 2)) should equal(true)
    ArrayII.has12(Array(3, 1, 4, 5, 2)) should equal(true)
  }
}
