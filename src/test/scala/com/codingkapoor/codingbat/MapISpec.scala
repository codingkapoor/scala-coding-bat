package com.codingkapoor.codingbat

import org.scalatest.{FlatSpec, Matchers}

class MapISpec extends FlatSpec with Matchers {

  """Method "mapBully"""" should """modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.""" in {
    MapI.mapBully(scala.collection.mutable.Map("a" -> "1", "b" -> "2")) should equal(Map("b" -> "1", "a" -> ""))
    MapI.mapBully(scala.collection.mutable.Map("a" -> "1")) should equal(Map("b" -> "1", "a" -> ""))
    MapI.mapBully(scala.collection.mutable.Map("a" -> "1", "b" -> "2", "c" -> "3")) should equal(Map("b" -> "1", "a" -> "", "c" -> "3"))
  }

  """Method "mapShare"""" should """modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value. In all cases remove the key "c", leaving the rest of the map unchanged.""" in {
    MapI.mapShare(scala.collection.mutable.Map("a" -> "1", "b" -> "2", "c" -> "3")) should equal(Map("a" -> "1", "b" -> "1"))
    MapI.mapShare(scala.collection.mutable.Map("b" -> "1", "c" -> "2")) should equal(Map("b" -> "1"))
    MapI.mapShare(scala.collection.mutable.Map("b" -> "1", "c" -> "2", "d" -> "3")) should equal(Map("b" -> "1", "d" -> "3"))
  }

  """Method "mapAB"""" should """modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys. If both keys are present, append their 2 string values together and store the result under the key "ab".""" in {
    MapI.mapAB(scala.collection.mutable.Map("a" -> "1", "b" -> "2")) should equal(Map("a" -> "1", "b" -> "2", "ab" -> "12"))
    MapI.mapAB(scala.collection.mutable.Map("a" -> "1")) should equal(Map("a" -> "1"))
    MapI.mapAB(scala.collection.mutable.Map("b" -> "2")) should equal(Map("b" -> "2"))
  }

  """Given a map of food keys and topping values, method "topping1"""" should """modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry". In all cases, set the key "bread" to have the value "butter".""" in {
    MapI.topping1(scala.collection.mutable.Map("ice cream" -> "peanuts")) should equal(Map("bread" -> "butter", "ice cream" -> "cherry"))
    MapI.topping1(scala.collection.mutable.Map("bread" -> "butter")) should equal(Map("bread" -> "butter"))
    MapI.topping1(scala.collection.mutable.Map("pancake" -> "syrup")) should equal(Map("bread" -> "butter", "pancake" -> "syrup"))
  }

  """Given a map of food keys and their topping values, method "topping2"""" should """modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also. If the key "spinach" has a value, change that value to "nuts".""" in {
    MapI.topping2(scala.collection.mutable.Map("ice cream" -> "cherry")) should equal(Map("yogurt" -> "cherry", "ice cream" -> "cherry"))
    MapI.topping2(scala.collection.mutable.Map("spinach" -> "dirt", "ice cream" -> "cherry")) should equal(Map("yogurt" -> "cherry", "ice cream" -> "cherry", "spinach" -> "nuts"))
    MapI.topping2(scala.collection.mutable.Map("yogurt" -> "salt")) should equal(Map("yogurt" -> "salt"))
  }

  """Given a map of food keys and topping values, method "topping3"""" should """modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries". If the key "salad" has a value, set that as the value for the key "spinach".""" in {
    MapI.topping3(scala.collection.mutable.Map("potato" -> "ketchup")) should equal(Map("potato" -> "ketchup", "fries" -> "ketchup"))
    MapI.topping3(scala.collection.mutable.Map("potato" -> "butter")) should equal(Map("potato" -> "butter", "fries" -> "butter"))
    MapI.topping3(scala.collection.mutable.Map("salad" -> "oil", "potato" -> "ketchup")) should equal(Map("spinach" -> "oil", "salad" -> "oil", "potato" -> "ketchup", "fries" -> "ketchup"))
  }

  """Method "mapAB2"""" should """modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both.""" in {
    MapI.mapAB2(scala.collection.mutable.Map("a" -> "1", "b" -> "1", "c" -> "2")) should equal(Map("c" -> "2"))
    MapI.mapAB2(scala.collection.mutable.Map("a" -> "1", "b" -> "2", "c" -> "3")) should equal(Map("a" -> "1", "b" -> "2", "c" -> "3"))
    MapI.mapAB2(scala.collection.mutable.Map("a" -> "1", "b" -> "2")) should equal(Map("a" -> "1", "b" -> "2"))
  }

  """Method "mapAB3"""" should """modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map.""" in {
    MapI.mapAB3(scala.collection.mutable.Map("a" -> "1", "c" -> "2")) should equal(Map("a" -> "1", "b" -> "1", "c" -> "2"))
    MapI.mapAB3(scala.collection.mutable.Map("b" -> "1", "c" -> "2")) should equal(Map("a" -> "1", "b" -> "1", "c" -> "2"))
    MapI.mapAB3(scala.collection.mutable.Map("a" -> "1", "b" -> "2", "c" -> "3")) should equal(Map("a" -> "1", "b" -> "2", "c" -> "3"))
  }

}
