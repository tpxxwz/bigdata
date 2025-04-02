package com.wjjzst.bigdata.scala_learn._01basic

import scala.collection.mutable


object _12Map {

  def main(args: Array[String]): Unit = {
    println("************** " + "Map init" + " **************")
    var m = Map[String, Int]("a" -> 1, "b" -> 2, "c" -> 3, "d" -> 4, "e" -> 5, "f" -> 6)

    println("\n************** " + "Map add entry" + " **************")
    m += ("j" -> 7)
    m += ("j" -> 11)
    println(m)
    println("\n************** " + "Map merge" + " **************")
    var n = m ++ Map[String, Int]("a" -> 3, "h" -> 4)
    println(n)
    println("\n************** " + "Map delete key" + " **************")
    //    n -= ("a", "b", "c")
    n --= Set("a", "b", "c")
    println(n)

    println("\n************** " + "Map change element" + " **************")
    val n2 = n.map {
      case (k, v) => (k, v + 1)
    }
    for (elem <- n2) {
      print(elem._1 + "->")
      print(elem._2)
      println("")
    }
  }

}
