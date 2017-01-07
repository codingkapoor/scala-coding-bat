package com.codingkapoor.codingbat

import org.scalatest.FlatSpec
import org.scalatest.Matchers

class StringISpec extends FlatSpec with Matchers {
  """Given a string name, e.g. "Bob", method "helloName"""" should """return a greeting of the form "Hello Bob!".""" in {
    StringI.helloName("Bob") should equal("Hello Bob!")
    StringI.helloName("Alice") should equal("Hello Alice!")
    StringI.helloName("X") should equal("Hello X!")
  }
}
