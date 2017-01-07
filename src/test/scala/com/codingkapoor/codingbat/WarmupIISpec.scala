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

  "stringSplosion" should "given a non-empty string like 'Code' return a string like 'CCoCodCode'" in {
    WarmupII.stringSplosion("Code") should equal("CCoCodCode")
    WarmupII.stringSplosion("abc") should equal("aababc")
    WarmupII.stringSplosion("ab") should equal("aab")
  }

  "last2, given a string" should "return the count of the number of times that a substring made of last 2 characters appears in the substring made of the rest of the string but the last to characters" in {
    WarmupII.last2("hixxhi") should equal(1)
    WarmupII.last2("xaxxaxaxx") should equal(1)
    WarmupII.last2("axxxaaxx") should equal(2)
  }

  "arrayCount2, given an array of ints" should "return the number of 9's in the array" in {
    WarmupII.arrayCount9(List(1, 2, 9)) should equal(1)
    WarmupII.arrayCount9(List(1, 9, 9)) should equal(2)
    WarmupII.arrayCount9(List(1, 9, 9, 3, 9)) should equal(3)
  }

  "arrayFront9, given an array of ints" should "return true if one of the first 4 elements in the array is a 9. The array length may be less than 4" in {
    WarmupII.arrayFront9(List(1, 2, 9, 3, 4)) should equal(true)
    WarmupII.arrayFront9(List(1, 2, 3, 4, 9)) should equal(false)
    WarmupII.arrayFront9(List(1, 2, 3, 4, 5)) should equal(false)
  }

  "array123, given an array of ints" should "return true if the sequence of numbers 1, 2, 3 appears in the array somewhere" in {
    WarmupII.array123(List(1, 1, 2, 3, 1)) should equal(true)
    WarmupII.array123(List(1, 1, 2, 4, 1)) should equal(false)
    WarmupII.array123(List(1, 1, 2, 1, 2, 3)) should equal(true)
  }

  "stringMatch, given 2 strings, a and b" should """return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings""" in {
    WarmupII.stringMatch("xxcaazz", "xxbaaz") should equal(3)
    WarmupII.stringMatch("abc", "abc") should equal(2)
    WarmupII.stringMatch("abc", "axc") should equal(0)
  }

  "stringX, given a string" should """return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed""" in {
    WarmupII.stringX("xxHxix") should equal("xHix")
    WarmupII.stringX("abxxxcd") should equal("abcd")
    WarmupII.stringX("xabxxxcdx") should equal("xabcdx")
  }

  "altPairs, given a string" should """return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien"""" in {
    WarmupII.altPairs("kitten") should equal("kien")
    WarmupII.altPairs("Chocolate") should equal("Chole")
    WarmupII.altPairs("CodingHorror") should equal("Congrr")
  }

  "stringYak, given a string" should """return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.""" in {
    WarmupII.stringYak("yakpak") should equal("pak")
    WarmupII.stringYak("pakyak") should equal("pak")
    WarmupII.stringYak("yak123ya") should equal("123ya")
  }

  "array667, given an array of ints" should """return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.""" in {
    WarmupII.array667(List(6, 6, 2)) should equal(1)
    WarmupII.array667(List(6, 6, 2, 6)) should equal(1)
    WarmupII.array667(List(6, 7, 2, 6)) should equal(1)
    WarmupII.array667(List(6, 6, 2, 6, 7)) should equal(2)
  }

  "Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array & noTriples" should "return true if the array does not contain any triples." in {
    WarmupII.noTriples(List(1, 1, 2, 2, 1)) should equal(true)
    WarmupII.noTriples(List(1, 1, 2, 2, 2, 1)) should equal(false)
    WarmupII.noTriples(List(1, 1, 1, 2, 2, 2, 1)) should equal(false)
  }

  "Given an array of ints, has271" should """return true if it contains a 2, 7, 1 pattern -- a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.""" in {
    WarmupII.has271(List(1, 2, 7, 1)) should equal(true)
    WarmupII.has271(List(1, 2, 8, 1)) should equal(false)
    WarmupII.has271(List(2, 7, 1)) should equal(true)
  }
}
