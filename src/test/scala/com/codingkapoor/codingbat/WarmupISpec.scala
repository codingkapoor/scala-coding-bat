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
}
