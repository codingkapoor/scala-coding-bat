package com.codingkapoor.codingbat

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

}
