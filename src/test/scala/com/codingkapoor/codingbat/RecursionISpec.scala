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

  """We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Method "triangle"""" should """compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.""" in {
    RecursionI.triangle(0) should equal(0)
    RecursionI.triangle(1) should equal(1)
    RecursionI.triangle(2) should equal(3)
  }

  """Given a non-negative int n, method "sumDigits"""" should """return the sum of its digits recursively (no loops).""" in {
    RecursionI.sumDigits(126) should equal(9)
    RecursionI.sumDigits(49) should equal(13)
    RecursionI.sumDigits(12) should equal(3)
  }

  """Given a non-negative int n, method "count7"""" should """return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops).""" in {
    RecursionI.count7(717) should equal(2)
    RecursionI.count7(7) should equal(1)
    RecursionI.count7(123) should equal(0)
  }

}
