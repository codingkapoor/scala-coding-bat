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

  """Given a list of strings, method "addStar"""" should """return a list where each string has "*" added at its end.""" in {
    FunctionalI.addStar(List("a", "bb", "ccc")) should equal(List("a*", "bb*", "ccc*"))
    FunctionalI.addStar(List("hello", "there")) should equal(List("hello*", "there*"))
    FunctionalI.addStar(List("*")) should equal(List("**"))
  }

  """Given a list of strings, method "copies3"""" should """return a list where each string is replaced by 3 copies of the string concatenated together.""" in {
    FunctionalI.copies3(List("a", "bb", "ccc")) should equal(List("aaa", "bbbbbb", "ccccccccc"))
    FunctionalI.copies3(List("24", "a", "")) should equal(List("242424", "aaa", ""))
    FunctionalI.copies3(List("hello", "there")) should equal(List("hellohellohello", "theretherethere"))
  }

}
