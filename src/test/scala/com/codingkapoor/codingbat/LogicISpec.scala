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

}
