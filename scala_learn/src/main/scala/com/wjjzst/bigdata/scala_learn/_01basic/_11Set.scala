package com.wjjzst.bigdata.scala_learn._01basic

import scala.collection.{immutable, mutable}


// LinkedList
object _11Set {

  def main(args: Array[String]): Unit = {
    val s1 = Set("aa", "bb", "zz")
    val s2 = Set("aa", "bb", "cc", "dd", "ee")
    println("************** " + "Set intersect" + " **************")
    //    val s3 = s1 intersect s2 // 交集 s1和s2 都有的
    val s3 = s1 & s2 // 交集
    println(s3)
    println("\n************** " + "Set diff" + " **************")
    //    val s4 = s1.diff(s2) // 差集 s1有但是s2没有的
    val s4 = s1 -- s2 // 差集
    println(s4)
    println("\n************** " + "Set union" + " **************")
    //    val s5 = s1.union(s2) // 补集 s1和s2加起来的
    //    val s5 = s1 | s2 // 补集 (zz, cc, ee, dd, aa, bb)
    val s5 = s1 ++ s2 // 补集 (zz, cc, ee, dd, aa, bb)
    println(s5)
    println("\n************** " + "Set append and remove" + " **************")
    println("\n************** " + "Set is mutable (default)" + " **************")
    var s6 = Set("aa", "bb")
    s6 += "cc"
    s6 += "cc"
    s6 -= "bb"
    println(s6)
    val s7 = Set("aa", "bb", "cc", "dd", "ee")
    println(s7 -- s6)
    println(s7 ++ s6)

    println("\n************** " + "Set sort" + " **************")
    //    var ss = collection.SortedSet("10", "22", "21", "32", "5") // collection.SortedSet 不可变
    //    var ss = immutable.SortedSet("10", "22", "21", "32", "5")
    //    val ss = immutable.SortedSet("10", "22", "21", "32", "5") // immutable.SortedSet 定义的 val ss 是不可以 += append的
    val ss = mutable.SortedSet("10", "22", "21", "32", "5") // mutable.SortedSet 定义的 val ss 是可以 += append的
    ss += "88"
    println(ss)

  }

}
