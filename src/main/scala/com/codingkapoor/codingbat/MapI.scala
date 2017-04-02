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
    if(map.contains("a") && map.contains("b"))
      map += ("ab" -> (map("a") + map("b")))
    map
  }

}
