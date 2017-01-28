package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class StringIISpec extends FlatSpec with Matchers {

  """Given a string, method "doubleChar"""" should """return a string where for every char in the original, there are two chars.""" in {
    StringII.doubleChar("The") should equal("TThhee")
    StringII.doubleChar("AAbb") should equal("AAAAbbbb")
    StringII.doubleChar("Hi-There") should equal("HHii--TThheerree")
  }

  """Method "countHi"""" should """return the number of times that the string "hi" appears anywhere in the given string.""" in {
    StringII.countHi("abc hi ho") should equal(1)
    StringII.countHi("ABChi hi") should equal(2)
    StringII.countHi("hihi") should equal(2)
  }

  """""" should """""" in {
    StringII.catDog("catdog") should equal(true)
    StringII.catDog("catcat") should equal(false)
    StringII.catDog("1cat1cadodog") should equal(true)
  }

  """""" should """""" in {
    StringII.countCode("aaacodebbb") should equal(1)
    StringII.countCode("codexxcode") should equal(2)
    StringII.countCode("cozexxcope") should equal(2)
  }

  """""" should """""" in {
    StringII.endOther("Hiabc", "abc") should equal(true)
    StringII.endOther("AbC", "HiaBc") should equal(true)
    StringII.endOther("abc", "abXabc") should equal(true)
  }

  """""" should """""" in {
    StringII.xyzThere("abcxyz") should equal(true)
    StringII.xyzThere("abc.xyz") should equal(false)
    StringII.xyzThere("xyz.abc") should equal(true)
  }
}
