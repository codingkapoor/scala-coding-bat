package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class StringIIISpec extends FlatSpec with Matchers {

  """Given a string, method "countXZ"""" should """return the count of the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow".""" in {
    StringIII.countYZ("fez day") should equal(2)
    StringIII.countYZ("day fez") should equal(2)
    StringIII.countYZ("day fyyyz") should equal(2)
  }

  """Given two strings, base and remove, method "withoutString"""" should """return a version of the base string where all instances of the remove string have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".""" in {
    StringIII.withoutString("Hello there", "llo") should equal("He there")
    StringIII.withoutString("Hello there", "e") should equal("Hllo thr")
    StringIII.withoutString("Hello there", "x") should equal("Hello there")
  }

  """Given a string, method "equalIsNot"""" should """return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive).""" in {
    StringIII.equalIsNot("This is not") should equal(false)
    StringIII.equalIsNot("This is notnot") should equal(true)
    StringIII.equalIsNot("noisxxnotyynotxisi") should equal(true)
  }

  """We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right. Method "gHappy"""" should """return true if all the g's in the given string are happy.""" in {
    StringIII.gHappy("xxggxx") should equal(true)
    StringIII.gHappy("xxgxx") should equal(false)
    StringIII.gHappy("xxggyygxx") should equal(false)
  }

  """We'll say that a "triple" in a string is a char appearing three times in a row. Method "countTriple"""" should """return the number of triples in the given string. The triples may overlap.""" in {
    StringIII.countTriple("abcXXXabc") should equal(1)
    StringIII.countTriple("xxxabyyyycd") should equal(3)
    StringIII.countTriple("a") should equal(0)
  }

  """Given a string, method "sumDigits"""" should """return the sum of the digits 0-9 that appear in the string, ignoring all other characters. Return 0 if there are no digits in the string.""" in {
    StringIII.sumDigits("aa1bc2d3") should equal(6)
    StringIII.sumDigits("aa11b33") should equal(8)
    StringIII.sumDigits("Chocolate") should equal(0)
  }

  """Given a string, method "sameEnds"""" should """return the longest substring that appears at both the beginning and end of the string without overlapping.""" in {
    StringIII.sameEnds("abXYab") should equal("ab")
    StringIII.sameEnds("xx") should equal("x")
    StringIII.sameEnds("xxx") should equal("x")
  }

  """Given a string, method "mirrorEnds"""" should """look for a mirror image (backwards) string at both the beginning and end of the given string. In other words, zero or more characters at the very begining of the given string, and at the very end of the string in reverse order (possibly overlapping).""" in {
    StringIII.mirrorEnds("abXYZba") should equal("ab")
    StringIII.mirrorEnds("abca") should equal("a")
    StringIII.mirrorEnds("aba") should equal("aba")
  }

  """Given a string, method "maxBlock"""" should """return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.""" in {
    StringIII.maxBlock("hoopla") should equal(2)
    StringIII.maxBlock("abbCCCddBBBxx") should equal(3)
    StringIII.maxBlock("") should equal(0)
  }

  """Given a string, method "sumNumbers"""" should """return the sum of the numbers appearing in the string, ignoring all other characters. A number is a series of 1 or more digit chars in a row.""" in {
    StringIII.sumNumbers("abc123xyz") should equal(123)
    StringIII.sumNumbers("aa11b33") should equal(44)
    StringIII.sumNumbers("7 11") should equal(18)
  }

//  """Given a string, method "notReplace"""" should """return a string where every appearance of the lowercase word "is" has been replaced with "is not". The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.""" in {
//    StringIII.notReplace("is test") should equal("is not test")
//    StringIII.notReplace("is-is") should equal("is not-is not")
//    StringIII.notReplace("This is right") should equal("This is not right")
//  }

}
