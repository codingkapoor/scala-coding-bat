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
}
