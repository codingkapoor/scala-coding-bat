package com.codingkapoor.codingbat

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class WarmupISpec extends FlatSpec with Matchers {

  "sleepIn" should "return true if it's weekend or we're on vacation else false" in {
    WarmupI.sleepIn(true, true) should equal(true)
    WarmupI.sleepIn(false, false) should equal(true)
    WarmupI.sleepIn(false, true) should equal(true)
    WarmupI.sleepIn(true, false) should equal(false)
  }

  "monkeyTrouble" should "return true if both the monkeys are smiling or if neither of them is smiling else false" in {
    WarmupI.monkeyTrouble(true, true) should equal(true)
    WarmupI.monkeyTrouble(false, false) should equal(true)
    WarmupI.monkeyTrouble(false, true) should equal(false)
    WarmupI.monkeyTrouble(true, false) should equal(false)
  }

  "sumDouble" should "return double of sum of a & b if both are equal else simply sum of a & b" in {
    WarmupI.sumDouble(2, 2) should equal(8)
    WarmupI.sumDouble(3, 2) should equal(5)
  }

  "diff21" should "return the absolute difference between n and 21, except return double the absolute difference if n is over 21" in {
    WarmupI.diff21(19) should equal(2)
    WarmupI.diff21(21) should equal(0)
    WarmupI.diff21(23) should equal(4)
  }

  "parrotTrouble" should "return true if the parrot is talking and the hour is before 7 or after 20 else false" in {
    WarmupI.parrotTrouble(true, 6) should equal(true)
    WarmupI.parrotTrouble(true, 8) should equal(false)
    WarmupI.parrotTrouble(false, 21) should equal(false)
    WarmupI.parrotTrouble(false, 9) should equal(false)
  }

  "makes10" should "return true if one of the given numbers is 10 or if their sum is 10 else false" in {
    WarmupI.makes10(10, 9) should equal(true)
    WarmupI.makes10(9, 10) should equal(true)
    WarmupI.makes10(5, 5) should equal(true)
    WarmupI.makes10(11, 9) should equal(false)
  }

  "nearHundred" should "return true if the given number is within 10 of 100 or 200 else false" in {
    WarmupI.nearHundred(91) should equal(true)
    WarmupI.nearHundred(199) should equal(true)
    WarmupI.nearHundred(89) should equal(false)
  }

  "posNeg" should "return true if one of the given numbers is negative and other one is positive. Except if the parameter 'negative' is true, then return true only if both are negative else false" in {
    WarmupI.posNeg(-1, -3, true) should equal(true)
    WarmupI.posNeg(-1, 3, true) should equal(false)
    WarmupI.posNeg(-1, 3, false) should equal(true)
    WarmupI.posNeg(1, 3, false) should equal(false)
  }

  "notString" should "return a new string where 'not ' has been added to the front of a given string. However, if the string already begins with 'not', return the string unchanged" in {
    WarmupI.notString("candy") should equal("not candy")
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
    WarmupI.front3("sr") should equal("srsrsr")
  }

  "backAround" should "return a new string with the last char added at the front and back" in {
    WarmupI.backAround("cat") should equal("tcatt")
  }

  "or35" should "return true if the given non-negative number is a multiple of 3 or a multiple of 5 else false" in {
    WarmupI.or35(729) should equal(true)
    WarmupI.or35(10) should equal(true)
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

  "close10" should "return whichever value is nearest to the value 10, or return 0 in the event of a tie of the given 2 int values" in {
    WarmupI.close10(8, 13) should equal(8)
    WarmupI.close10(13, 8) should equal(8)
    WarmupI.close10(13, 7) should equal(0)
  }

  "in3050" should "return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive of the given 2 int values" in {
    WarmupI.in3050(30, 31) should equal(true)
    WarmupI.in3050(30, 41) should equal(false)
    WarmupI.in3050(40, 50) should equal(true)
  }

  "max1020" should "return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range of given 2 int values" in {
    WarmupI.max1020(11, 19) should equal(19)
    WarmupI.max1020(19, 11) should equal(19)
    WarmupI.max1020(11, 9) should equal(11)
    WarmupI.max1020(8, 9) should equal(0)
  }

  "stringE" should "return true if the given string contains between 1 and 3 'e' chars" in {
    WarmupI.stringE("Hello") should equal(true)
    WarmupI.stringE("Heelle") should equal(true)
    WarmupI.stringE("Heelele") should equal(false)
  }

  "lastDigit" should "return true if the two given numbers have the same last digit" in {
    WarmupI.lastDigit(7, 17) should equal(true)
    WarmupI.lastDigit(6, 17) should equal(false)
    WarmupI.lastDigit(3, 113) should equal(true)
  }

  "endUp" should "return a new string where the last 3 chars are now in upper case, given a string" in {
    WarmupI.endUp("Hello") should equal("HeLLO")
    WarmupI.endUp("hi there") should equal("hi thERE")
    WarmupI.endUp("hi") should equal("HI")
  }

  "everyNth" should "return the string made starting with char 0, and then every Nth char of the given string" in {
    WarmupI.everyNth("Miracle", 2) should equal("Mrce")
    WarmupI.everyNth("abcdefg", 2) should equal("aceg")
    WarmupI.everyNth("abcdefg", 3) should equal("adg")
  }
}
