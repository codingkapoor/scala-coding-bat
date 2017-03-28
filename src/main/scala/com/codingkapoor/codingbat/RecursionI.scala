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

}
