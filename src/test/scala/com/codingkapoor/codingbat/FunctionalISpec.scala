package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class FunctionalISpec extends FlatSpec with Matchers {

  """Given a list of integers, method "doubling"""" should """return a list where each integer is multiplied by 2.""" in {
    FunctionalI.doubling(List(1, 2, 3)) should equal(List(2, 4, 6))
    FunctionalI.doubling(List(6, 8, 6, 8, -1)) should equal(List(12, 16, 12, 16, -2))
    FunctionalI.doubling(List()) should equal(List())
  }

  """Given a list of integers, method "square"""" should """return a list where each integer is multiplied with itself.""" in {
    FunctionalI.square(List(1, 2, 3)) should equal(List(1, 4, 9))
    FunctionalI.square(List(6, 8, -6, -8, 1)) should equal(List(36, 64, 36, 64, 1))
    FunctionalI.square(List()) should equal(List())
  }

}
