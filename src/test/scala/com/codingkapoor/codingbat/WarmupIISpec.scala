package com.codingkapoor.codingbat

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class WarmupIISpec extends FlatSpec with Matchers {

  "stringTimes" should "return a larger string that is 'n' copies of the original string, given a string and a non-negative int 'n'" in {
    WarmupII.stringTimes("Hi", 2) should equal("HiHi")
    WarmupII.stringTimes("Hi", 3) should equal("HiHiHi")
    WarmupII.stringTimes("Hi", 1) should equal("Hi")
  }

  "frontTimes" should "return n copies of the first three characters of a given string" in {
    WarmupII.frontTimes("Chocolate", 2) should equal("ChoCho")
    WarmupII.frontTimes("Chocolate", 3) should equal("ChoChoCho")
    WarmupII.frontTimes("Abc", 3) should equal("AbcAbcAbc")
  }

  "countXX" should "return the Count of the number of 'xx' in a given string where overlapping of the pattern is allowed" in {
    WarmupII.countXX("abcxx") should equal(1)
    WarmupII.countXX("xxx") should equal(2)
    WarmupII.countXX("xxxx") should equal(3)
  }

  "doubleX" should "return true if the first instance of 'x' in a given string is immediately followed by another 'x'" in {
    WarmupII.doubleX("axxbb") should equal(true)
    WarmupII.doubleX("axaxax") should equal(false)
    WarmupII.doubleX("xxxxx") should equal(true)
  }

  "stringBits" should "return a new string made of every other char in a given string starting with the first, so 'Hello' yields 'Hlo'" in {
    WarmupII.stringBits("Hello") should equal("Hlo")
    WarmupII.stringBits("Hi") should equal("H")
    WarmupII.stringBits("Heeololeo") should equal("Hello")
  }
  
  
}
