package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class RecursionIISpec extends FlatSpec with Matchers {

  """Given an array of ints, method "groupSum"""" should """evaluate if it is possible to choose a group of some of the ints, such that the group sums to the given target?""" in {
    RecursionII.groupSum(0, List(2, 4, 8), 10) should equal(true)
    RecursionII.groupSum(0, List(2, 4, 8), 14) should equal(true)
    RecursionII.groupSum(0, List(2, 4, 8), 9) should equal(false)
    RecursionII.groupSum2(0, List(2, 4, 8), 10) should equal(true)
    RecursionII.groupSum2(0, List(2, 4, 8), 14) should equal(true)
    RecursionII.groupSum2(0, List(2, 4, 8), 9) should equal(false)
  }

  """Given an array of ints, method "groupSum6"""" should """evaluate if it is possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target? However, with the additional constraint that all 6's must be chosen.""" in {
    RecursionII.groupSum6(0, List(5, 6, 2), 8) should equal(true)
    RecursionII.groupSum6(0, List(5, 6, 2), 9) should equal(false)
    RecursionII.groupSum6(0, List(5, 6, 2), 7) should equal(false)
  }

  """Given an array of ints, method "groupNoAdj"""" should """evaluate if it is possible to choose a group of some of the ints, such that the group sums to the given target with this additional constraint: If a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen.""" in {
    RecursionII.groupNoAdj(0, List(2, 5, 10, 4), 12) should equal(true)
    RecursionII.groupNoAdj(0, List(2, 5, 10, 4), 14) should equal(false)
    RecursionII.groupNoAdj(0, List(2, 5, 10, 4), 7) should equal(false)
  }

}
