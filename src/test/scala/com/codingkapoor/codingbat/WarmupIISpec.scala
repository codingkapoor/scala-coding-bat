package com.codingkapoor.codingbat

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class WarmupIISpec extends FlatSpec with Matchers {

  "stringTimes" should "return a larger string that is 'n' copies of the original string, given a string and a non-negative int 'n'" in {
    WarmupII.stringTimes("Hi", 2) should equal("HiHi")
    WarmupII.stringTimes("Hi", 3) should equal("HiHiHi")
    WarmupII.stringTimes("Hi", 1) should equal("Hi")
  }
}
