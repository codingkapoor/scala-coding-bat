package com.codingkapoor.codingbat

object MapII {

  def word0(ls: List[String]): Map[String, Int] = {
    ls.map { x => x -> 0 }.toMap
  }

  def word0II(ls: List[String]): scala.collection.mutable.Map[String, Int] = {
    ls.foldLeft(scala.collection.mutable.Map[String, Int]()) { (m, s) => m(s) = 0; m }
  }

  def word0III(ls: List[String]): Map[String, Int] = {
    ls.foldLeft(scala.collection.immutable.Map[String, Int]()) { (m, s) => m + (s -> 0) }
  }

  def wordLen(strings: List[String]): Map[String, Int] = {
    strings.foldLeft(Map[String, Int]()) { (m, s) => m + (s -> s.length) }
  }

  def pairs(strings: List[String]): Map[String, String] = {
    strings.map { x => x.head.toString -> x.last.toString }.toMap
  }

  def wordCount(strings: List[String]): Map[String, Int] = {
    strings.map { x => x -> strings.count(_ == x) }.toMap
  }

  def firstChar(strings: List[String]): Map[Char, String] = {
    strings.groupBy(_.head).mapValues(x => x.foldLeft("")((acc, s) => acc + s))
  }

  // Interesting problem and solution
  def wordAppend(strings: List[String]) = {
    strings.groupBy(x => x).mapValues(x => x.length).filter(x => x._2 % 2 == 0).map(x => x._1 * (x._2 / 2)).foldLeft("")((acc, s) => acc + s)
  }

  def wordMultiple(strings: List[String]): Map[String, Boolean] = {
    strings.groupBy(x => x).mapValues(x => x.length).mapValues(x => if (x >= 2) true else false)
  }

}
