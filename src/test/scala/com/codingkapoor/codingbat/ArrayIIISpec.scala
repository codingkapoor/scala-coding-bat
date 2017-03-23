package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class ArrayIIISpec extends FlatSpec with Matchers {
  """Consider the leftmost and righmost appearances of some value in an array. We'll say that the "span" is the number of elements between the two inclusive. A single value has a span of 1. Method "maxSpan"""" should """returns the largest span found in the given array.""" in {
    ArrayIII.maxSpan(Array(1, 2, 1, 1, 3)) should equal(4)
    ArrayIII.maxSpan(Array(1, 4, 2, 1, 4, 1, 4)) should equal(6)
    ArrayIII.maxSpan(Array(1, 4, 2, 1, 4, 4, 4)) should equal(6)
  }
}
