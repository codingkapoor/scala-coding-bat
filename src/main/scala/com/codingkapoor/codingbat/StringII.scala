package com.codingkapoor.codingbat

object StringII {

  def doubleChar(str: String): String = {
    str.map(x => s"$x" * 2).mkString
  }

  def countHi(str: String): Int = {
    str.iterator.sliding(2).toList.map(x => x.mkString).count(_ == "hi")
  }

  def catDog(str: String): Boolean = {
    val res = str.iterator.sliding(3).toList.map(x => x.mkString)
    res.count(_ == "cat") == res.count(_ == "dog")
  }

  def countCode(str: String): Int = {
    val pattern = s"co[a-z|A-Z]e".r
    pattern.findAllIn(str).toList.size
  }

  def endOther(a: String, b: String): Boolean = {
    val ls = List(a.toLowerCase, b.toLowerCase).sortWith(_ < _)
    ls.last.endsWith(ls.head)
  }

  def xyzThere(str: String): Boolean = {
    val pattern1 = s"[.]xyz".r
    val pattern2 = s"xyz".r

    if (pattern1.findAllIn(str).isEmpty) {
      if (pattern2.findAllIn(str).isEmpty) false else true
    } else false
  }

  def bobThere(str: String): Boolean = {
    val pattern = s"b[a-z|A-Z|0-9]b".r
    pattern.findAllIn(str).nonEmpty
  }

  def xyBalance(str: String): Boolean = {
    val rev = str.reverse
    val index = rev.indexOf('x')

    rev.take(index)
    rev.take(index).contains('y')
  }

  def mixString(a: String, b: String): String = {
    a.zipAll(b, "", "").map(x => s"${x._1}" + s"${x._2}").mkString
  }

  def repeatEnd(str: String, n: Int): String = {
    str.drop(str.length - n) * n
  }

  def repeatFront(str: String, n: Int): String = {
    if (n < 1) "" else str.take(n) + repeatFront(str, n - 1)
  }

  def repeatSeparator(word: String, sep: String, count: Int): String = {
    word + (sep + word) * (count - 1)
  }

  def prefixAgain(str: String, n: Int): Boolean = {
    str.drop(n).contains(str.take(n))
  }

  def xyzMiddle(str: String): Boolean = {
    val res = str.iterator.sliding(3).toList.map(_.mkString)
    val mid = res.size / 2

    if (res.size % 2 == 0) res(mid) == "xyz" || res(mid - 1) == "xyz" || res(mid + 1) == "xyz"
    else res(mid) == "xyz"
  }

  def getSandwich(str: String): String = {
    val first = str.indexOf("bread")
    val last = str.lastIndexOf("bread")

    if (first == last) "" else str.substring(first + 5, last)
  }

  def sameStarChar(str: String): Boolean = {
    if (str.length < 3) false
    else {
      str.iterator.sliding(3).toList.filter(x => x(1) == '*').count(x => x.head == x.last) > 0
    }
  }

  def oneTwo(str: String): String = {
    str.grouped(3).toList.map(x => if (x.length < 3) x else x.tail :+ x.head).mkString
  }

  def zipZap(str: String): String = {
    val pattern = s"z[a-z|A-Z]p".r
    pattern.replaceAllIn(str, "zp")
  }

  def starOut(str: String): String = {
    val pattern = s"[a-z|A-Z]?[*]+[a-z|A-Z]?".r
    pattern.replaceAllIn(str, "")
  }

  def plusOut(str: String, word: String): String = {
    val res = str.split(word).map(x => "+" * x.length).mkString(word)
    if (str.endsWith(word)) res + word else res
  }

  // TODO Yet to device an appropriate regex for this problem. The closest I could reach is defined below.
  def wordEnds(str: String, word: String) = {
    val str = "abcXY123XYijk"
    val pattern = s"(?=([a-z|A-Z|0-9]?(XY)+[a-z|A-Z|0-9]?))".r
    pattern.findAllMatchIn(str).map(_.group(1)).toList
  }

}
