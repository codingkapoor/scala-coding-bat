package com.codingkapoor.codingbat

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class WarmupISpec extends FlatSpec with Matchers {

  "sleepIn" should "return true if both weekday and vacation are true" in {
    WarmupI.sleepIn(true, true) should equal(true)
  }

  "sleepIn" should "return true if both weekday and vacation are false" in {
    WarmupI.sleepIn(false, false) should equal(true)
  }

  "sleepIn" should "return true if weekday is false and vacation is true" in {
    WarmupI.sleepIn(false, true) should equal(true)
  }

  "sleepIn" should "return false if weekday is true and vacation is false" in {
    WarmupI.sleepIn(true, false) should equal(false)
  }

  "monkeyTrouble" should "return true if both aSmile and bSmile are true" in {
    WarmupI.monkeyTrouble(true, true) should equal(true)
  }

  "monkeyTrouble" should "return true if both aSmile and bSmile are false" in {
    WarmupI.monkeyTrouble(false, false) should equal(true)
  }

  "monkeyTrouble" should "return false if aSmile is false and bSmile is true" in {
    WarmupI.monkeyTrouble(false, true) should equal(false)
  }

  "monkeyTrouble" should "return false if aSmile is true and bSmile is false" in {
    WarmupI.monkeyTrouble(true, false) should equal(false)
  }

  "sumDouble" should "return double of sum of a & b if both are equal" in {
    WarmupI.sumDouble(2, 2) should equal(8)
  }

  "sumDouble" should "return sum of a & b if both are different" in {
    WarmupI.sumDouble(3, 2) should equal(5)
  }

  "diff21" should "return 2 if n is 19" in {
    WarmupI.diff21(19) should equal(2)
  }

  "diff21" should "return 0 if n is 21" in {
    WarmupI.diff21(21) should equal(0)
  }

  "diff21" should "return 4 if n is 23 which is over 21" in {
    WarmupI.diff21(23) should equal(4)
  }

  "parrotTrouble" should "return true if hour is '<' 7 or '>' 20 and parrot is talking" in {
    WarmupI.parrotTrouble(true, 6) should equal(true)
  }

  "parrotTrouble" should "return false if hour is '>' 7 or '<' 20 and parrot is talking" in {
    WarmupI.parrotTrouble(true, 8) should equal(false)
  }

  "parrotTrouble" should "return false if hour is '<' 7 or '>' 20 and parrot is not talking" in {
    WarmupI.parrotTrouble(false, 21) should equal(false)
  }

  "parrotTrouble" should "return false if hour is '>' 7 or '<' 20 and parrot is not talking" in {
    WarmupI.parrotTrouble(false, 9) should equal(false)
  }

  "makes10" should "return true only if a is 10 and neither b is 10 nor their sum is 10 " in {
    WarmupI.makes10(10, 9) should equal(true)
  }

  "makes10" should "return true only if b is 10 and neither a is 10 nor their sum is 10 " in {
    WarmupI.makes10(9, 10) should equal(true)
  }

  "makes10" should "return true if a + b is 10 and neither a is 10 nor b is 10 " in {
    WarmupI.makes10(5, 5) should equal(true)
  }

  "makes10" should "return false if neither a is 10 nor b is 10 or their sum is 10 " in {
    WarmupI.makes10(11, 9) should equal(false)
  }

  "nearHundred" should "return true if n is within 10 of 100" in {
    WarmupI.nearHundred(91) should equal(true)
  }

  "nearHundred" should "return true if n is within 10 of 200" in {
    WarmupI.nearHundred(199) should equal(true)
  }

  "nearHundred" should "return false if n is not within 10 of 100 or 10 of 200" in {
    WarmupI.nearHundred(89) should equal(false)
  }

  "posNeg" should "return true if negative is true and both a and b are negative numbers" in {
    WarmupI.posNeg(-1, -3, true) should equal(true)
  }

  "posNeg" should "return false if negative is true and either a and b or both are positive numbers" in {
    WarmupI.posNeg(-1, 3, true) should equal(false)
  }

  "posNeg" should "return true if negative is false and either a and b or both are negative numbers" in {
    WarmupI.posNeg(-1, 3, false) should equal(true)
  }

  "posNeg" should "return false if negative is false and both a and b are positive numbers" in {
    WarmupI.posNeg(1, 3, false) should equal(false)
  }
}
