package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class FunctionalIISpec extends FlatSpec with Matchers {

  """Given a list of integers, method "noNeg"""" should """return a list of the integers, omitting any that are less than 0.""" in {
    FunctionalII.noNeg(List(1, -2)) should equal(List(1))
    FunctionalII.noNeg(List(-3, -3, 3, 3)) should equal(List(3, 3))
    FunctionalII.noNeg(List(-1, -1, -1)) should equal(List())
  }

}
