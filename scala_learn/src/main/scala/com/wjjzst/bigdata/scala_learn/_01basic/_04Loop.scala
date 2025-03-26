package com.wjjzst.bigdata.scala_learn._01basic

// import scala.util.control.Breaks.{break, breakable}

import scala.util.control.Breaks._ // _ 导入所有


object _04Loop {

  def main(args: Array[String]): Unit = {
    println(" ************** " + "case 1 to 左右闭区间" + " **************")

    val num: Int = 10
    for (i: Int <- 1 to num) { // to 左右闭区间
      println(i)
    }

    println("\n************** " + "case 2 for list遍历" + " **************")
    val ss = List[String]("bb", "aa", "cc", "dd")
    for (item: String <- ss) {
      println(item)
    }

    println("\n************** " + "case 3 until 右开区间" + " **************")
    for (i: Int <- 1 until 10; if i % 2 == 0) { // until 直到但不包含 右开区间
      println(i)
    }

    println("\n************** " + "case 4 map函数" + " **************")
    // 对集合数据的转换
    val s = (1 to 100 by 5).map { x => // 从1开始每隔5 取一个 1 6 11 ...
      val y = x * 3
      println(y)
      y
    }
    println(s"s: $s") // Vector(3, 18, 33, 48, 63, 78, 93, 108, 123, 138, 153, 168, 183, 198, 213, 228, 243, 258, 273, 288)

    println("\n************** " + "case 5 map使用自定义函数" + " **************")
    val result = (1 to 100 by 5).map { x: Int => x * 5 }
    val result2 = (1 to 100 by 5).map(f5)
    println(s"result: $result")
    println(s"result2: $result2")

    println("\n************** " + "case 6 case匹配" + " **************")
    val s1 = Array((20, 3), (30, 3), (40, "4")).map {
      case (k: Int, v: Int) => (k, k + v)
      //case _ => (-1, -1)
      /**
       * 在 Scala 中，Left 和 Right 是 Either 类型的一部分，通常用于表示计算可能成功或失败的情况
       * Either 是 Scala 用来表示两种可能结果的类型：
       * •Left：通常代表失败或错误信息
       * •Right：通常代表成功的结果
       * 这和 Option（Some / None）类似，但 Either 可以提供更详细的错误信息。
       */
      case other => Left(s"Invalid data: $other")
    }
    // collection.mkString(start: String, sep: String, end: String) 左边 分隔符 右边
    println(s1.mkString("Array(", ", ", ")"))

    println("\n************** " + "case 7 空格接方法 _表示左边的数据集里面的每个元素 " + " **************")
    val v1 = (1 to 10) filter {
      _ % 2 == 0
    } map {
      _ * 2
    }
    val v2 = (1 until 30 by 5).filter {
      _ % 2 == 0
    }.map {
      _ * 2
    }
    println(s"v1: $v1")
    println(s"v2: $v2")

    println("\n************** " + "case 8 while 和 do while " + " **************")
    println("while")
    var num1 = 1
    while (num1 < 10) {
      println(num1)
      num1 = num1 + 1
    }
    println("do while")
    var num2 = 5
    do {
      println(num2)
      num2 = num2 + 1
    } while (num2 < 7)


    println("\n************** " + "case 9 break or continue " + " **************")

    print("start")
    val l = List[Int](1, 2, 3, 4, 5, 6)
    breakable {
      for (x <- l) {
        if (x > 4) break
        println(x)
      }
    }
  }

  private def f5(x: Int): Int = 2 * x
}
