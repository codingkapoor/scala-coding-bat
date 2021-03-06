package com.codingkapoor.codingbat

object WarmupII {

  def stringTimes(str: String, n: Int): String = {
    str * n
  }

  def frontTimes(str: String, n: Int): String = {
    str.take(3) * n
  }

  def countXX(str: String): Int = {
    val pattern = "(?=xx)".r
    pattern.findAllIn(str).size
  }

  def doubleX(str: String): Boolean = {
    val ls = str.toList.zipWithIndex.filter(_._1 == 'x').view take 2
    ls(1)._2 == ls.head._2 + 1
  }

  def stringBits(str: String): String = {
    str.toList.zipWithIndex.filter(_._2 % 2 == 0).map(_._1).mkString
  }

  def stringSplosion(str: String): String = {
    def recursive(n: Int, str: String): String = {
      if (n == 0) str
      else recursive(n - 1, str.take(n - 1)) + str
    }

    recursive(str.length(), str)
  }

  def last2(str: String): Int = {
    val pattern = s"(?=${str.drop(str.length() - 2)})".r
    pattern.findAllIn(str.take(str.length() - 2)).size
  }

  def arrayCount9(ints: List[Int]): Int = {
    ints.count(_ == 9)
  }

  def arrayFront9(ints: List[Int]): Boolean = {
    ints.take(4).count(_ == 9) > 0
  }

  def array123(ints: List[Int]): Boolean = {
    val pattern = "123".r
    pattern.findAllIn(ints.mkString).nonEmpty
  }

  /*
   * stringMatch(a: String, b: String) 
   * 
   * scala> val a = "xxcaazz"
   * a: String = xxcaazz
   * 
   * scala> val b = "xxbaaz"
   * b: String = xxbaaz
   * 
   * scala> val ls1 = a zip a.tail
   * ls1: scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((x,x), (x,c), (c,a), (a,a), (a,z), (z,z))
   * 
   * scala> val ls2 = b zip b.tail
   * ls2: scala.collection.immutable.IndexedSeq[(Char, Char)] = Vector((x,x), (x,b), (b,a), (a,a), (a,z))
   * 
   * scala> val ls = ls1 zip ls2
   * ls: scala.collection.immutable.IndexedSeq[((Char, Char), (Char, Char))] = Vector(((x,x),(x,x)), ((x,c),(x,b)), ((c,a),(b,a)), ((a,a),(a,a)), ((a,z),(a,z)))
   * 
   * scala> ls.filter(x => x._1 == x._2)
   * res107: scala.collection.immutable.IndexedSeq[((Char, Char), (Char, Char))] = Vector(((x,x),(x,x)), ((a,a),(a,a)), ((a,z),(a,z)))
	*/

  def stringMatch(a: String, b: String): Int = {
    val ls = (a zip a.tail) zip (b zip b.tail)
    ls.count(x => x._1 == x._2)
  }

  def stringX(str: String): String = {
    str.head + str.init.tail.filter { _ != 'x' } + str.last
  }

  def altPairs(str: String): String = {
    str.zipWithIndex.filter(x => x._2 % 4 == 0 || x._2 % 4 == 1).map(_._1).mkString
  }

  def stringYak(str: String): String = {
    str.replaceAll("y.k", "")
  }

  def array667(nums: List[Int]): Int = {
    val pairs = nums zip nums.tail
    pairs.filter(x => x._2 == 6 || x._2 == 7).count(_._1 == 6)
  }

  def noTriples(nums: List[Int]): Boolean = {
    val ls = (nums, nums.tail, nums.tail.tail).zipped.toList
    ls.count(x => x._1 == x._2 && x._1 == x._3) == 0
  }

  def has271(nums: List[Int]): Boolean = {
    val ls = (nums, nums.tail, nums.tail.tail).zipped.toList
    ls.count(x => x._2 == x._1 + 5 && x._3 <= x._1 - 1) > 0
  }
}
