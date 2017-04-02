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

}
