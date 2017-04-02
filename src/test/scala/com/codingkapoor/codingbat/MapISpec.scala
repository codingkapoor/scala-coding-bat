package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class MapISpec extends FlatSpec with Matchers {

  """Method "mapBully"""" should """modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.""" in {
    MapI.mapBully(scala.collection.mutable.Map("a" -> "1", "b" -> "2")) should equal(Map("b" -> "1", "a" -> ""))
    MapI.mapBully(scala.collection.mutable.Map("a" -> "1")) should equal(Map("b" -> "1", "a" -> ""))
    MapI.mapBully(scala.collection.mutable.Map("a" -> "1", "b" -> "2", "c" -> "3")) should equal(Map("b" -> "1", "a" -> "", "c" -> "3"))
  }

}
