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
}
