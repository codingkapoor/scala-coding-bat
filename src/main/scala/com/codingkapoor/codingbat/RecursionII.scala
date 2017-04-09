package com.codingkapoor.codingbat

import scala.annotation.tailrec

object RecursionII {

  def groupSum(start: Int, ls: List[Int], target: Int) = {
    (1 to ls.size).exists(y => ls.drop(start).combinations(y).exists(x => x.sum == target))
  }

  def groupSum2(start: Int, ls: List[Int], target: Int) = {
    (1 to ls.size).exists(y => ls.drop(start).permutations.toList.map(x => x.take(y)).map(_.sorted).distinct.exists(x => x.take(y).sum == target))
  }

  def groupSum6(start: Int, ls: List[Int], target: Int) = {
    (1 to ls.size).exists(y => ls.drop(start).combinations(y).filter(x => x.count(_ == 6) == ls.count(_ == 6)).exists(x => x.sum == target))
  }

  def groupNoAdj(start: Int, ls: List[Int], target: Int) = {
    val ls1 = ls.drop(start).zipWithIndex
    val ls2 = List(ls1.filter(x => x._2 % 2 == 0).map(_._1), ls1.filter(x => x._2 % 2 != 0).map(_._1))
    (1 to ls.size).exists(y => ls2.exists(t => t.combinations(y).exists(x => x.sum == target)))
  }

  def groupSum5(start: Int, ls: List[Int], target: Int) = {

    @tailrec
    def drop1Mul5(res: List[Int], ls: List[Int]): List[Int] = ls match {
      case Nil => res
      case x :: Nil => drop1Mul5(res :+ x, Nil)
      case x :: xs => if (x % 5 == 0 && xs.head == 1) drop1Mul5(res :+ x, xs.tail) else drop1Mul5(res :+ x, xs)
    }

    val ks = drop1Mul5(Nil, ls)

    (1 to ks.size).exists(y => ks.drop(start).combinations(y).filter(x => x.count(_ % 5 == 0) == ks.count(_ % 5 == 0)).exists(x => x.sum == target))
  }

  def groupSumClump(start: Int, ls: List[Int], target: Int) = {

    // This method counts all the consecutive elements at the beginning of a list that are similar.
    // For example, for a list, List(4, 4, 4, 5, 6, 1, 2), count will be 3 for element 4.
    @tailrec
    def countConsecutives(count: Int, head: Int, ls: List[Int]): Int = ls match {
      case Nil => count
      case x :: Nil => if (x == head) countConsecutives(count + 1, head, Nil) else countConsecutives(count, head, Nil)
      case x :: xs => if (x == head) countConsecutives(count + 1, head, xs) else countConsecutives(count, head, Nil)
    }

    // This method prepares a map of all the elements and the list of all the counts of times they appear consecutively.
    // For example, for list, List(4, 4, 4, 5, 6, 1, 2, 4), returned map would be Map(4 -> List(1, 3), 1 -> List(1), 5 -> List(1), 6 -> List(1), 2 -> List(1))
    @tailrec
    def prepareClumpsMap(res: Map[Int, List[Int]], ls: List[Int]): Map[Int, List[Int]] = ls match {
      case Nil => res
      case x :: Nil => prepareClumpsMap(res + (x -> List(1)), Nil)
      case x :: xs =>
        val count = countConsecutives(1, x, xs)
        res.get(x) match {
          case Some(y) => if (y.contains(count)) prepareClumpsMap(res, xs.drop(count - 1)) else prepareClumpsMap(res + (x -> (count :: y)), xs.drop(count - 1))
          case None => prepareClumpsMap(res + (x -> List(count)), xs.drop(count - 1))
        }
    }

    val m2 = prepareClumpsMap(Map.empty, ls)

    (1 to ls.size).exists(y => ls.drop(start).combinations(y).filter {
      t =>
        // This map maintains count of each element in a particular combination. See next comment for an example.
        val m1 = t.distinct.map(x => x -> t.count(_ == x)).toMap

        // Every element in a particular combination needs to satisfy the following condition i.e., either the combination has to have all
        // the consecutive number of elements as per map m2 or number of such elements should be greater than the max number of consecutive
        // occurrences of that element in map m2. For example, if '4' appear once '3' times consecutively and then '1' time once, then the total
        // number of '4's' in a combination of 4 elements could have '4' '4's'.
        // For example, for a
        // list, List(1, 2, 3, 4, 4, 4, 6, 6, 7, 4, 6, 1) and it's
        // map, Map(1 -> List(1), 6 -> List(1, 2), 2 -> List(1), 7 -> List(1), 3 -> List(1), 4 -> List(1, 3))Map(1 -> List(1), 6 -> List(1, 2), 2 -> List(1), 7 -> List(1), 3 -> List(1), 4 -> List(1, 3))
        // & a combination, List(1, 2, 4, 3, 4, 4, 5, 4), and it's map, Map(1 -> 1, 2 -> 1, 3 -> 1, 4 -> 4, 5 -> 1)
        // element '4' can occur 3 + 1 i.e., 4 times.
        t.distinct.forall {
          x =>
            val Some(i) = m1.get(x)
            val Some(j) = m2.get(x)
            i >= j.max || j.contains(i)
        }
    }.exists(x => x.sum == target))

  }

  def splitArray(ls: List[Int]) = {
    (1 to Math.ceil(ls.size / 2).toInt).exists(y => ls.combinations(y).exists(x => (ls diff x).sum == x.sum))
  }

  def splitOdd10(ls: List[Int]) = {
    (1 to Math.ceil(ls.size / 2).toInt).exists(y => ls.combinations(y).exists {
      x => ((ls diff x).sum % 10 == 0 && x.sum % 2 != 0) || ((ls diff x).sum % 2 != 0 && x.sum % 10 == 0)
    })
  }

  def split53(ls: List[Int]) = {
    (1 to Math.ceil(ls.size / 2).toInt).exists(y => ls.combinations(y).exists {
      x =>
        (x.sum == (ls diff x).sum) &&
          (x.count(_ % 3 == 0) == 0 && (ls diff x).count(_ % 5 == 0) == 0 ||
            (ls diff x).count(_ % 3 == 0) == 0 && x.count(_ % 5 == 0) == 0)
    })
  }

}
