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

  """Method "catDog"""" should """return true if the string "cat" and "dog" appear the same number of times in the given string.""" in {
    StringII.catDog("catdog") should equal(true)
    StringII.catDog("catcat") should equal(false)
    StringII.catDog("1cat1cadodog") should equal(true)
  }

  """Method "countCode"""" should """return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.""" in {
    StringII.countCode("aaacodebbb") should equal(1)
    StringII.countCode("codexxcode") should equal(2)
    StringII.countCode("cozexxcope") should equal(2)
  }

  """Given two strings, method "endOther"""" should """return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences.""" in {
    StringII.endOther("Hiabc", "abc") should equal(true)
    StringII.endOther("AbC", "HiaBc") should equal(true)
    StringII.endOther("abc", "abXabc") should equal(true)
  }

  """Method "xyzThere"""" should """return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.""" in {
    StringII.xyzThere("abcxyz") should equal(true)
    StringII.xyzThere("abc.xyz") should equal(false)
    StringII.xyzThere("xyz.abc") should equal(true)
  }

  """Method "bobThere"""" should """return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.""" in {
    StringII.bobThere("abcbob") should equal(true)
    StringII.bobThere("b9b") should equal(true)
    StringII.bobThere("bac") should equal(false)
  }

  """We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Method "xyBalance"""" should """return true if the given string is xy-balanced.""" in {
    StringII.xyBalance("aaxbby") should equal(true)
    StringII.xyBalance("aaxbb") should equal(false)
    StringII.xyBalance("yaaxbb") should equal(false)
  }

  """Given two strings, a and b, method "mixString"""" should """return a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.""" in {
    StringII.mixString("abc", "xyz") should equal("axbycz")
    StringII.mixString("Hi", "There") should equal("HTihere")
    StringII.mixString("xxxx", "There") should equal("xTxhxexre")
  }

  """Given a string and an int n, method "repeatEnd"""" should """return a string made of n repetitions of the last n characters of the string.""" in {
    StringII.repeatEnd("Hello", 3) should equal("llollollo")
    StringII.repeatEnd("Hello", 2) should equal("lolo")
    StringII.repeatEnd("Hello", 1) should equal("o")
  }

  """Given a string and an int n, method "repeatFront"""" should """return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on.""" in {
    StringII.repeatFront("Chocolate", 4) should equal("ChocChoChC")
    StringII.repeatFront("Chocolate", 3) should equal("ChoChC")
    StringII.repeatFront("Ice Cream", 2) should equal("IcI")
  }

  """Given two strings, word and a separator sep, method "repeatSeparator"""" should """return a big string made of count occurrences of the word, separated by the separator string.""" in {
    StringII.repeatSeparator("Word", "X", 3) should equal("WordXWordXWord")
    StringII.repeatSeparator("This", "And", 2) should equal("ThisAndThis")
    StringII.repeatSeparator("This", "And", 1) should equal("This")
  }

  """Given a string, consider the prefix string made of the first N chars of the string. Method "prefixAgain"""" should """return true if that prefix string appears somewhere else in the string.""" in {
    StringII.prefixAgain("abXYabc", 1) should equal(true)
    StringII.prefixAgain("abXYabc", 2) should equal(true)
    StringII.prefixAgain("abXYabc", 3) should equal(false)
  }

  """Given a string, method "xyzMiddle"""" should """return true if "xyz" appear in the middle of the string. To define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one.""" in {
    StringII.xyzMiddle("AAxyzBB") should equal(true)
    StringII.xyzMiddle("AxyzBB") should equal(true)
    StringII.xyzMiddle("AxyzBBB") should equal(false)
  }

  """A sandwich is two pieces of bread with something in between. Method "getSandwich"""" should """return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.""" in {
    StringII.getSandwich("breadjambread") should equal("jam")
    StringII.getSandwich("xxbreadjambreadyy") should equal("jam")
    StringII.getSandwich("xxbreadyy") should equal("")
  }

  """Method "sameStarChar"""" should """return true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same.""" in {
    StringII.sameStarChar("xy*yzz") should equal(true)
    StringII.sameStarChar("xy*zzz") should equal(false)
    StringII.sameStarChar("*xa*az") should equal(true)
  }

  """Given a string, method "oneTwo"""" should """compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.""" in {
    StringII.oneTwo("abc") should equal("bca")
    StringII.oneTwo("tca") should equal("cat")
    StringII.oneTwo("tcagdo") should equal("catdog")
  }

  """Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Method "zipZap"""" should """return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".""" in {
    StringII.zipZap("zipXzap") should equal("zpXzp")
    StringII.zipZap("zopzop") should equal("zpzp")
    StringII.zipZap("zzzopzop") should equal("zzzpzp")
  }

  """Method "starOut"""" should """return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".""" in {
    StringII.starOut("ab*cd") should equal("ad")
    StringII.starOut("ab**cd") should equal("ad")
    StringII.starOut("sm*eilly") should equal("silly")
  }

  """Given a string and a non-empty word string, method "plusOut"""" should """return a version of the original String where all chars have been replaced by pluses ("+"), except for appearances of the word string which are preserved unchanged.""" in {
    StringII.plusOut("12xy34", "xy") should equal("++xy++")
    StringII.plusOut("12xy34", "1") should equal("1+++++")
    StringII.plusOut("12xy34xyabcxy", "xy") should equal("++xy++xy+++xy")
  }

  """Given a string and a non-empty word string, method "wordEnds"""" should """return a string made of each char just before and just after every appearance of the word in the string. Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.""" ignore {
    StringII.wordEnds("abcXY123XYijk", "XY") should equal("c13i")
    StringII.wordEnds("XY123XY", "XY") should equal("13")
    StringII.wordEnds("XY1XY", "XY") should equal("11")
  }
}
