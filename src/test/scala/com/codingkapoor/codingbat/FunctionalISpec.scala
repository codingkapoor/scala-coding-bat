package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class FunctionalISpec extends FlatSpec with Matchers {

  """Given a list of integers, method "doubling"""" should """return a list where each integer is multiplied by 2.""" in {
    FunctionalI.doubling(List(1, 2, 3)) should equal(List(2, 4, 6))
    FunctionalI.doubling(List(6, 8, 6, 8, -1)) should equal(List(12, 16, 12, 16, -2))
    FunctionalI.doubling(List()) should equal(List())
  }

}
