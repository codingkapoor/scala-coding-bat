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

  "notString" should "return the input string with 'not' prefixed" in {
    WarmupI.notString("candy") should equal("not candy")
  }

  "notString" should "return the input string as it is, if it already starts with 'not'" in {
    WarmupI.notString("not bad") should equal("not bad")
  }

  "missingChar" should "return a new string where the char at index n has been removed" in {
    WarmupI.missingChar("kitten", 4) should equal("kittn")
  }

  "frontBack" should "return a new string where the first and last chars have been exchanged" in {
    WarmupI.frontBack("code") should equal("eodc")
  }

  "front3" should "return a new string which is 3 copies of the front where front is the first 3 chars of the string" in {
    WarmupI.front3("code") should equal("codcodcod")
  }

  "front3" should "return a new string which is 3 copies of the front where front is the first few characters of the string of length '<' 3" in {
    WarmupI.front3("sr") should equal("srsrsr")
  }

  "backAround" should "return a new string with the last char added at the front and back" in {
    WarmupI.backAround("cat") should equal("tcatt")
  }

  "or35" should "return true if n is a multiple of 3 or 5" in {
    WarmupI.or35(729) should equal(true)
    WarmupI.or35(10) should equal(true)
  }

  "or35" should "return false if n is not a multiple of 3 or 5" in {
    WarmupI.or35(11) should equal(false)
  }

  "front22" should "return the string with the fitst 2 chars added at both the front and back" in {
    WarmupI.front22("kitten") should equal("kikittenki")
    WarmupI.front22("ki") should equal("kikiki")
    WarmupI.front22("k") should equal("kkk")
  }

  "startHi" should "return true if the input string starts with word 'hi'" in {
    WarmupI.startHi("hi there") should equal(true)
    WarmupI.startHi("hi") should equal(true)
    WarmupI.startHi("there hi") should equal(false)
    WarmupI.startHi("hihello") should equal(true)
  }

  "icyHot" should "return true if out of two given temperatures one is less than 0 and the other is greater than 100" in {
    WarmupI.icyHot(120, -1) should equal(true)
    WarmupI.icyHot(-1, 120) should equal(true)
    WarmupI.icyHot(2, 120) should equal(false)
  }

  "in1020" should "return true if either of the given numbers are in the range 10..20 inclusive" in {
    WarmupI.in1020(12, 99) should equal(true)
    WarmupI.in1020(21, 12) should equal(true)
    WarmupI.in1020(8, 99) should equal(false)
  }

  "hasTeen" should "return true if 1 or more of the given numbers are in the range 13..19 inclusive" in {
    WarmupI.hasTeen(13, 20, 10) should equal(true)
    WarmupI.hasTeen(20, 19, 10) should equal(true)
    WarmupI.hasTeen(20, 10, 13) should equal(true)
    WarmupI.hasTeen(20, 10, 89) should equal(false)
  }

  "loneTeen" should "return true if one or the other of the two given numbers is teen, but not both" in {
    WarmupI.loneTeen(13, 99) should equal(true)
    WarmupI.loneTeen(21, 19) should equal(true)
    WarmupI.loneTeen(13, 13) should equal(false)
  }

  "delDel" should "return a string where first occurance of 'del' has been deleted where it is present at index 1. Otherwise, return the string unchanged" in {
    WarmupI.delDel("adelbc") should equal("abc")
    WarmupI.delDel("adelHello") should equal("aHello")
    WarmupI.delDel("adedbc") should equal("adedbc")
  }

  "mixStart" should "return true if the given string begins with 'mix', except the 'm' can be anything, so 'pix', '9ix', etc. all count" in {
    WarmupI.mixStart("mix snacks") should equal(true)
    WarmupI.mixStart("pix snacks") should equal(true)
    WarmupI.mixStart("9ix snacks") should equal(true)
    WarmupI.mixStart("piz snacks") should equal(false)
  }

  "startOz" should "return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z'" in {
    WarmupI.startOz("ozymandias") should equal("oz")
    WarmupI.startOz("bzoo") should equal("z")
    WarmupI.startOz("oxx") should equal("o")
  }

  "intMax" should "return max of given three numbers" in {
    WarmupI.intMax(12, 120, 1) should equal(120)
  }

  "close10" should "return whichever value is nearest to the value 10, or return 0 in the event of a tie, given 2 int values" in {
    WarmupI.close10(8, 13) should equal(8)
    WarmupI.close10(13, 8) should equal(8)
    WarmupI.close10(13, 7) should equal(0)
  }
}
