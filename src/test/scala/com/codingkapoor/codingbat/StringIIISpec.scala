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
}
