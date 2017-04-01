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

  """Given a non-negative int n, method "count8"""" should """compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.""" in {
    RecursionI.count8(8) should equal(1)
    RecursionI.count8(818) should equal(2)
    RecursionI.count8(8818) should equal(4)
  }

  """Given base and n that are both 1 or more, method "powerN"""" should """compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared).""" in {
    RecursionI.powerN(3, 1) should equal(3)
    RecursionI.powerN(3, 2) should equal(9)
    RecursionI.powerN(3, 3) should equal(27)
  }

  """Given a string, method "countX"""" should """compute recursively (no loops) the number of lowercase 'x' chars in the string.""" in {
    RecursionI.countX("xxhixx") should equal(4)
    RecursionI.countX("xhixhix") should equal(3)
    RecursionI.countX("hi") should equal(0)
  }

  """Given a string, method "countHi"""" should """compute recursively (no loops) the number of times lowercase "hi" appears in the string.""" in {
    RecursionI.countHi("xxhixx") should equal(1)
    RecursionI.countHi("xhixhix") should equal(2)
    RecursionI.countHi("hi") should equal(1)
  }

  """Given a string, method "changeXY"""" should """compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.""" in {
    RecursionI.changeXY("codex") should equal("codey")
    RecursionI.changeXY("xxhixx") should equal("yyhiyy")
    RecursionI.changeXY("xhixhix") should equal("yhiyhiy")
  }

  """Given a string, method "changePi"""" should """compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".""" in {
    RecursionI.changePi("xpix") should equal("x3.14x")
    RecursionI.changePi("pipi") should equal("3.143.14")
    RecursionI.changePi("pip") should equal("3.14p")
  }

  """Given a string, method "noX"""" should """compute recursively a new string where all the 'x' chars have been removed.""" in {
    RecursionI.noX("xaxb") should equal("ab")
    RecursionI.noX("abc") should equal("abc")
    RecursionI.noX("xx") should equal("")
  }

  """Given an array of ints, method "array6"""" should """compute recursively if the array contains a 6. We'll use the convention of considering only the part of the array that begins at the given index.""" in {
    RecursionI.array6(Array(1, 6, 4), 0) should equal(true)
    RecursionI.array6(Array(1, 4), 0) should equal(false)
    RecursionI.array6(Array(6), 0) should equal(true)
  }

  """Given an array of ints, method "array11"""" should """compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index.""" in {
    RecursionI.array11(Array(1, 2, 11), 0) should equal(1)
    RecursionI.array11(Array(11, 11), 0) should equal(2)
    RecursionI.array11(Array(1, 2, 3, 4), 0) should equal(0)
  }

  """Given an array of ints, method "array220"""" should """compute recursively if the array contains somewhere a value followed in the array by that value times 10. We'll use the convention of considering only the part of the array that begins at the given index.""" in {
    RecursionI.array220(Array(1, 2, 20), 0) should equal(true)
    RecursionI.array220(Array(3, 30), 0) should equal(true)
    RecursionI.array220(Array(3), 0) should equal(false)
  }

  """Given a string, method "allStar"""" should """compute recursively a new string where all the adjacent chars are now separated by a "*".""" in {
    RecursionI.allStar("hello") should equal("h*e*l*l*o")
    RecursionI.allStar("abc") should equal("a*b*c")
    RecursionI.allStar("ab") should equal("a*b")
  }

  """Given a string, method "pairStar"""" should """compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".""" in {
    RecursionI.pairStar("hello") should equal("hel*lo")
    RecursionI.pairStar("xxyy") should equal("x*xy*y")
    RecursionI.pairStar("aaaa") should equal("a*a*a*a")
  }

  """Given a string, method "endX"""" should """compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.""" in {
    RecursionI.endX("xxre") should equal("rexx")
    RecursionI.endX("xxhixx") should equal("hixxxx")
    RecursionI.endX("xhixhix") should equal("hihixxx")
  }

  """We'll say that a "pair" in a string is two instances of a char separated by a char. So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x. Method "countpairs"""" should """recursively compute the number of pairs in the given string.""" in {
    RecursionI.countPairs("axa") should equal(1)
    RecursionI.countPairs("axax") should equal(2)
    RecursionI.countPairs("axbx") should equal(1)
  }

  """Method countAbc""" should """count recursively the total number of "abc" and "aba" substrings that appear in the given string.""" in {
    RecursionI.countAbc("abc") should equal(1)
    RecursionI.countAbc("abcxxabc") should equal(2)
    RecursionI.countAbc("abaxxaba") should equal(2)
  }

}
