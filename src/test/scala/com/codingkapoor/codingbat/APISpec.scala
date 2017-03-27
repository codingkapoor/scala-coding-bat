package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class APISpec extends FlatSpec with Matchers {

  """Given an array of scores, method "scoresIncreasing"""" should """return true if each score is equal or greater than the one before. The array will be length 2 or more.""" in {
    API.scoresIncreasing(Array(1, 3, 4)) should equal(true)
    API.scoresIncreasing(Array(1, 3, 2)) should equal(false)
    API.scoresIncreasing(Array(1, 1, 4)) should equal(true)
  }

}
