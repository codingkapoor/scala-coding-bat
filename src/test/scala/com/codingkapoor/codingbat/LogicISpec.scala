package com.codingkapoor.codingbat

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class LogicISpec extends FlatSpec with Matchers {

  """When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Method "cigarParty"""" should """return true if the party with the given values is successful, or false otherwise.""" in {
    LogicI.cigarParty(30, false) should equal(false)
    LogicI.cigarParty(50, false) should equal(true)
    LogicI.cigarParty(70, true) should equal(true)
  }
}
