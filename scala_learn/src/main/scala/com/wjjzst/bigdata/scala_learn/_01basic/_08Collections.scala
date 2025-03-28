package com.wjjzst.bigdata.scala_learn._01basic


object _08Collections {

  def main(args: Array[String]): Unit = {
    //    val is = collection.immutable.Stack(1,2,3) 2.13 没有了 immutable.List 代替 同后进先出
    val is = collection.immutable.List(1, 2, 3) // List默认是后进先出
    println(is)
//    is(2) = 100     // immutable 不能改变值
//    println(is)
    val ms = collection.mutable.Stack(1, 2, 3)
    println(ms)
    ms(0) = 100
    println(ms)


  }


}
