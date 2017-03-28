package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class RecursionISpec extends FlatSpec with Matchers {

  """Given n of 1 or more, method "factorial"""" should """return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the result recursively (without loops).""" in {
    RecursionI.factorial(1) should equal(1)
    RecursionI.factorial(2) should equal(2)
    RecursionI.factorial(3) should equal(6)
  }

  """We have a number of bunnies and each bunny has two big floppy ears. Method bunnyEars""" should """compute the total number of ears across all the bunnies recursively (without loops or multiplication).""" in {
    RecursionI.bunnyEars(0) should equal(0)
    RecursionI.bunnyEars(1) should equal(2)
    RecursionI.bunnyEars(2) should equal(4)
  }

  """Method "fibonacci"""" should """returns the nth fibonacci number, with n=0 representing the start of the sequence.""" in {
    RecursionI.fibonacci(0) should equal(0)
    RecursionI.fibonacci(1) should equal(1)
    RecursionI.fibonacci(2) should equal(1)
  }

  """We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Method "bunnyEars2"""" should """return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).""" in {
    RecursionI.bunnyEars2(0) should equal(0)
    RecursionI.bunnyEars2(1) should equal(2)
    RecursionI.bunnyEars2(2) should equal(5)
  }

}
