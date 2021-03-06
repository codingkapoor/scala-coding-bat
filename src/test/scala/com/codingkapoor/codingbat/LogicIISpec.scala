package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class LogicIISpec extends FlatSpec with Matchers {

  """We want to make a row of bricks that is "goal" inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each). Method "makeBricks"""" should """return true if it is possible to make the goal by choosing from the given bricks.""" in {
    LogicII.makeBricks(3, 1, 8) should equal(true)
    LogicII.makeBricks(3, 1, 9) should equal(false)
    LogicII.makeBricks(3, 2, 10) should equal(true)
  }

  """Given 3 int values, a b c, method "loneSum"""" should """return their sum. However, if one of the values is the same as another of the values, it does not count towards the sum.""" in {
    LogicII.loneSum(1, 2, 3) should equal(6)
    LogicII.loneSum(3, 2, 3) should equal(2)
    LogicII.loneSum(3, 3, 3) should equal(0)
  }

  """Given 3 int values, a b c, method "luckySum"""" should """return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.""" in {
    LogicII.luckySum(1, 2, 3) should equal(6)
    LogicII.luckySum(1, 2, 13) should equal(3)
    LogicII.luckySum(1, 13, 3) should equal(1)
  }

  """Given 3 int values, a b c, method "noTeenSum"""" should """return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens.""" in {
    LogicII.noTeenSum(1, 2, 3) should equal(6)
    LogicII.noTeenSum(2, 13, 1) should equal(3)
    LogicII.noTeenSum(2, 1, 14) should equal(3)
  }

  """For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, method "roundSum"""" should """return the sum of their rounded values.""" in {
    LogicII.roundSum(16, 17, 18) should equal(60)
    LogicII.roundSum(12, 13, 14) should equal(30)
    LogicII.roundSum(6, 4, 4) should equal(10)
  }

  """Given three ints, a b c, method "closeFar"""" should """return true if one of b or c is "close" (differing from a by at most 1), while the other is "far", differing from both other values by 2 or more.""" in {
    LogicII.closeFar(1, 2, 10) should equal(true)
    LogicII.closeFar(1, 2, 3) should equal(false)
    LogicII.closeFar(4, 1, 3) should equal(true)
  }

  """Given 2 int values greater than 0, method "blackJack"""" should """return whichever value is nearest to 21 without going over. Return 0 if they both go over.""" in {
    LogicII.blackJack(19, 21) should equal(21)
    LogicII.blackJack(21, 19) should equal(21)
    LogicII.blackJack(19, 22) should equal(19)
  }

  """Given three ints, a b c, one of them is small, one is medium and one is large. Method "evenlySpaced"""" should """return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.""" in {
    LogicII.evenlySpaced(2, 4, 6) should equal(true)
    LogicII.evenlySpaced(4, 6, 2) should equal(true)
    LogicII.evenlySpaced(4, 6, 3) should equal(false)
  }

  """We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each). Method "makeChocolate"""" should """return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done.""" in {
    LogicII.makeChocolate(4, 1, 9) should equal(4)
    LogicII.makeChocolate(4, 1, 10) should equal(-1)
    LogicII.makeChocolate(4, 1, 7) should equal(2)
  }
}
