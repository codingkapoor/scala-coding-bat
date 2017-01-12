package com.codingkapoor.codingbat

object ArrayI {

  def firstLast6(arr: Array[Int]) = {
    if (arr.length < 1) false else arr.head == 6 || arr.last == 6
  }
  
}