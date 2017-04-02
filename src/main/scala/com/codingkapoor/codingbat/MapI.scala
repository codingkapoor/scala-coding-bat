package com.codingkapoor.codingbat

object MapI {

  def mapBully(map: scala.collection.mutable.Map[String, String]) = {
    if (map.contains("a")) {
      map += ("b" -> map("a"))
      map += ("a" -> "")
    }

    map
  }

  def mapShare(map: scala.collection.mutable.Map[String, String]) = {
    if (map.contains("a"))
      map += ("b" -> map("a"))
    map -= "c"
  }

  def mapAB(map: scala.collection.mutable.Map[String, String]) = {
    if (map.contains("a") && map.contains("b"))
      map += ("ab" -> (map("a") + map("b")))
    map
  }

  def topping1(map: scala.collection.mutable.Map[String, String]) = {
    map += ("bread" -> "butter")

    if (map.contains("ice cream"))
      map += ("ice cream" -> "cherry")

    map
  }

  def topping2(map: scala.collection.mutable.Map[String, String]) = {
    if (map.contains("ice cream"))
      map += ("yogurt" -> map("ice cream"))

    if (map.contains("spinach"))
      map += ("spinach" -> "nuts")

    map
  }

  def topping3(map: scala.collection.mutable.Map[String, String]) = {
    if (map.contains("potato"))
      map += ("fries" -> map("potato"))

    if (map.contains("salad"))
      map += ("spinach" -> map("salad"))

    map
  }

  def mapAB2(map: scala.collection.mutable.Map[String, String]) = {
    if (map.contains("a") && map.contains("b") && map("a") == map("b")) {
      map -= "a"
      map -= "b"
    }

    map
  }

}
