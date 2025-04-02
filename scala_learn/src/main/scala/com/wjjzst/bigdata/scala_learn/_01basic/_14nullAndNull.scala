package com.wjjzst.bigdata.scala_learn._01basic

// Null只有null一个实例
object _14nullAndNull {
  def main(args: Array[String]): Unit = {
    var s1: String = null
    //    tryIt(s1) // 不能调用
    tryIt(null) // 可以调用
    val s2: Null = null
    tryIt(s2) // 可以调用
  }

  def tryIt(thing: Null): Unit = {
    println("that worked!")
  }

}
