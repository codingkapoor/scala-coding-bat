package com.codingkapoor.codingbat

import scala.annotation.tailrec

object RecursionI {

  def factorial(n: Int): Int = {
    if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
  }

  def bunnyEars(bunnies: Int): Int = {
    if (bunnies == 0) 0
    else if (bunnies == 1) 2
    else 2 + bunnyEars(bunnies - 1)
  }

  def fibonacci(n: Int) = {

    @tailrec
    def fibonacciR(first: Int, second: Int, counter: Int): Int = {
      if (counter == 0) first
      else fibonacciR(second, first + second, counter - 1)
    }

    fibonacciR(0, 1, n)
  }

  def bunnyEars2(bunnies: Int): Int = {
    if (bunnies == 0) 0
    else if (bunnies % 2 != 0) 2 + bunnyEars2(bunnies - 1)
    else 3 + bunnyEars2(bunnies - 1)
  }

  def triangle(rows: Int): Int = {
    if (rows == 0) 0 else if (rows == 1) 1 else {
      rows + triangle(rows - 1)
    }
  }

  def sumDigits(n: Int) = {
    n.toString.map(_.asDigit).sum
  }

  def count7(n: Int) = {
    n.toString.map(_.asDigit).count(_ == 7)
  }

  def count8(n: Int) = {
    val digitsInPair = n.toString.toList.sliding(2, 2).toList

    @tailrec
    def count8(counter: Int, ls: List[List[Char]]): Int = ls match {
      case Nil => counter
      case x :: Nil =>
        val c = x.count(_ == '8'); if (c == 2) count8(counter + c + 1, Nil) else count8(counter + c, Nil)
      case x :: xs =>
        val c = x.count(_ == '8'); if (c == 2) count8(counter + c + 1, xs) else count8(counter + c, xs)
    }

    count8(0, digitsInPair)
  }

  def powerN(n: Int, base: Int) = {

    @tailrec
    def powerNR(res: Int, counter: Int): Int = {
      if (counter == 1) res
      else powerNR(res * n, counter - 1)
    }

    powerNR(n, base)
  }

}
