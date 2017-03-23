package com.codingkapoor.codingbat

object ArrayIII {
  def maxSpan(arr: Array[Int]): Int = {
    arr.distinct.map { x => arr.lastIndexOf(x) - arr.indexOf(x) }.max + 1
  }
}
