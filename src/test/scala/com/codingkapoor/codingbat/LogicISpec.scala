package com.codingkapoor.codingbat

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class LogicISpec extends FlatSpec with Matchers {

  """When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Method "cigarParty"""" should """return true if the party with the given values is successful, or false otherwise.""" in {
    LogicI.cigarParty(30, false) should equal(false)
    LogicI.cigarParty(50, false) should equal(true)
    LogicI.cigarParty(70, true) should equal(true)
  }

  """You and your date are trying to get a table at a restaurant. The parameter "you" is the stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 8 or more, the method "dateFashion"""" should """return 2(yes) as the result, with the exception that if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).""" in {
    LogicI.dateFashion(5, 10) should equal(2)
    LogicI.dateFashion(5, 2) should equal(0)
    LogicI.dateFashion(5, 5) should equal(1)
  }

  """The squirrels in Palo Alto spend most of the day playing. In particular, they play if the temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer, method "squirrelPlay"""" should """return true if the squirrels play and false otherwise.""" in {
    LogicI.squirrelPlay(70, false) should equal(true)
    LogicI.squirrelPlay(95, false) should equal(false)
    LogicI.squirrelPlay(95, true) should equal(true)
  }

  """You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or less, method "caughtSpeeding"""" should """return 0 as result. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.""" in {
    LogicI.caughtSpeeding(60, false) should equal(0)
    LogicI.caughtSpeeding(65, false) should equal(1)
    LogicI.caughtSpeeding(65, true) should equal(0)
  }

  """Given 2 ints, a and b, method "sortaSum"""" should """return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.""" in {
    LogicI.sortaSum(3, 4) should equal(7)
    LogicI.sortaSum(9, 4) should equal(20)
    LogicI.sortaSum(10, 11) should equal(21)
  }

  """Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation, method "alarmClock"""" should """return a string of the form "7:00" indicating when the alarm clock should ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".""" in {
    LogicI.alarmClock(1, false) should equal("7:00")
    LogicI.alarmClock(5, false) should equal("7:00")
    LogicI.alarmClock(0, false) should equal("10:00")
  }

  """The number 6 is a truly great number. Given two int values, a and b, method "love6"""" should """return true if either one is 6. Or if their sum or difference is 6.""" in {
    LogicI.love6(6, 4) should equal(true)
    LogicI.love6(4, 5) should equal(false)
    LogicI.love6(1, 5) should equal(true)
  }

  """Given a number n, method "in1To10"""" should """return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true, in which case return true if the number is less or equal to 1, or greater or equal to 10.""" in {
    LogicI.in1To10(5, false) should equal(true)
    LogicI.in1To10(11, false) should equal(false)
    LogicI.in1To10(11, true) should equal(true)
  }

  """We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Method """"" should """return true if the given non-negative number is special.""" in {
    LogicI.specialEleven(22) should equal(true)
    LogicI.specialEleven(23) should equal(true)
    LogicI.specialEleven(24) should equal(false)
  }

  """Method "more20"""" should """return true if the given non-negative number is 1 or 2 more than a multiple of 20.""" in {
    LogicI.more20(20) should equal(false)
    LogicI.more20(21) should equal(true)
    LogicI.more20(22) should equal(true)
  }

  """Method "old35"""" should """return true if the given non-negative number is a multiple of 3 or 5, but not both.""" in {
    LogicI.old35(3) should equal(true)
    LogicI.old35(10) should equal(true)
    LogicI.old35(15) should equal(false)
  }

  """Method "less20"""" should """return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.""" in {
    LogicI.less20(18) should equal(true)
    LogicI.less20(19) should equal(true)
    LogicI.less20(20) should equal(false)
  }

  """Given a non-negative number "num", method "nearTen"""" should """return true if num is within 2 of a multiple of 10.""" in {
    LogicI.nearTen(12) should equal(true)
    LogicI.nearTen(17) should equal(false)
    LogicI.nearTen(19) should equal(true)
  }

  """Given 2 ints, a and b, method "teenSum"""" should """return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19.""" in {
    LogicI.teenSum(3, 4) should equal(7)
    LogicI.teenSum(10, 13) should equal(19)
    LogicI.teenSum(13, 2) should equal(19)
  }

  """Your cell phone rings. Method "answerCell"""" should """return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer.""" in {
    LogicI.answerCell(isMorning = false, isMom = false, isAsleep = false) should equal(true)
    LogicI.answerCell(isMorning = false, isMom = false, isAsleep = true) should equal(false)
    LogicI.answerCell(isMorning = true, isMom = false, isAsleep = false) should equal(false)
  }

  """We are having a party with amounts of tea and candy. Method "teaParty"""" should """return the int outcome of the party encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5. However, if either tea or candy is at least double the amount of the other one, the party is great (2). However, in all cases, if either tea or candy is less than 5, the party is always bad (0).""" in {
    LogicI.teaParty(6, 8) should equal(1)
    LogicI.teaParty(3, 5) should equal(0)
    LogicI.teaParty(20, 6) should equal(2)
  }

  """Given a string str, if the string starts with "f" method "fizzString"""" should """return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.""" in {
    LogicI.fizzString("fig") should equal("Fizz")
    LogicI.fizzString("dib") should equal("Buzz")
    LogicI.fizzString("fib") should equal("FizzBuzz")
  }

  """Given an int n, method "fizzString2"""" should """return the string form of the number followed by "!". So the int 6 yields "6!". Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".""" in {
    LogicI.fizzString2(1) should equal("1!")
    LogicI.fizzString2(2) should equal("2!")
    LogicI.fizzString2(3) should equal("Fizz!")
  }

  """Given three ints, a b c, method "twoAsOne"""" should """return true if it is possible to add two of the ints to get the third.""" in {
    LogicI.twoAsOne(1, 2, 3) should equal(true)
    LogicI.twoAsOne(3, 1, 2) should equal(true)
    LogicI.twoAsOne(3, 2, 2) should equal(false)
  }

  """Given three ints, a b c, method "inOrder"""" should """return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a.""" in {
    LogicI.inOrder(1, 2, 4, false) should equal(true)
    LogicI.inOrder(1, 2, 1, false) should equal(false)
    LogicI.inOrder(1, 1, 2, true) should equal(true)
  }

  """Given three ints, a b c, method "inOrderEqual"""" should """return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7. However, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5.""" in {
    LogicI.inOrderEqual(2, 5, 11, false) should equal(true)
    LogicI.inOrderEqual(5, 7, 6, false) should equal(false)
    LogicI.inOrderEqual(5, 5, 7, true) should equal(true)
  }

  """Given three ints, a b c, method "lastDigit"""" should """return true if two or more of them have the same rightmost digit. The ints are non-negative.""" in {
    LogicI.lastDigit(23, 19, 13) should equal(true)
    LogicI.lastDigit(23, 19, 12) should equal(false)
    LogicI.lastDigit(23, 19, 3) should equal(true)
  }

  """Given three ints, a b c, method "lessBy10"""" should """return true if one of them is 10 or more less than one of the others.""" in {
    LogicI.lessBy10(1, 7, 11) should equal(true)
    LogicI.lessBy10(1, 7, 10) should equal(false)
    LogicI.lessBy10(11, 1, 7) should equal(true)
  }

  """Method "withoutDoubles"""" should """return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.""" in {
    LogicI.withoutDoubles(2, 3, true) should equal(5)
    LogicI.withoutDoubles(3, 3, true) should equal(7)
    LogicI.withoutDoubles(3, 3, false) should equal(6)
  }

  """Given two int values, method "maxMod5"""" should """return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0.""" in {
    LogicI.maxMod5(2, 3) should equal(3)
    LogicI.maxMod5(6, 2) should equal(6)
    LogicI.maxMod5(3, 2) should equal(3)
  }

  """You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2, method "redTicket"""" should """returns 10 as result. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.""" in {
    LogicI.redTicket(2, 2, 2) should equal(10)
    LogicI.redTicket(2, 2, 1) should equal(0)
    LogicI.redTicket(0, 0, 0) should equal(5)
  }

  """You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, method "greenTicket"""" should """return 0 as result. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.""" in {
    LogicI.greenTicket(1, 2, 3) should equal(0)
    LogicI.greenTicket(2, 2, 2) should equal(20)
    LogicI.greenTicket(1, 1, 2) should equal(10)
  }

  """You have a blue lottery ticket, with ints a, b, and c on it. This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair. If any pair sums to exactly 10, method "blueTicket"""" should """return 10 as the result.  Otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5. Otherwise the result is 0.""" in {
    LogicI.blueTicket(9, 1, 0) should equal(10)
    LogicI.blueTicket(9, 2, 0) should equal(0)
    LogicI.blueTicket(6, 1, 4) should equal(10)
  }

  """Given two ints, each in the range 10..99, method "shareDigit"""" should """return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.""" in {
    LogicI.shareDigit(12, 23) should equal(true)
    LogicI.shareDigit(12, 43) should equal(false)
    LogicI.shareDigit(12, 44) should equal(false)
  }

  """Given 2 non-negative ints, a and b, method "sumLimit"""" should """return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b.""" in {
    LogicI.sumLimit(2, 3) should equal(5)
    LogicI.sumLimit(8, 3) should equal(8)
    LogicI.sumLimit(8, 1) should equal(9)
  }
}
