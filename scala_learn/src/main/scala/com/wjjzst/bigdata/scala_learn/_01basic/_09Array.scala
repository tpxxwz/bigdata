package com.wjjzst.bigdata.scala_learn._01basic

object _09Array {

  def main(args: Array[String]): Unit = {
    val a1 = Array[Int](1, 2, 3, 4)
    val a2 = Array[Int](100, 200, 300, 400)
    val a = Array.concat(a1, a2)
    println(a1.mkString("Array a1(", ", ", ")"))
    a(1) = 1000
    println("************** " + "Array 遍历" + " **************")
    a.foreach { x =>
      println(x)
    }
    println("\n************** " + "Array 不指定反省， 数组的类型可以是任意" + " **************")
    val b = Array(333, "333", '3', false)
    val c = List.concat(a, b)
    println(c.mkString("Array c(", ", ", ")"))

    println("\n************** " + "Array 的过滤" + " **************")
    val x = a.filter(_ % 2 != 0)
    println(x.mkString("Array x(", ", ", ")"))
    println("\n************** " + "Array 的反转" + " **************")
    val y = x.reverse
    y.foreach(println(_))
    println("\n************** " + "Array 的group by" + " **************")
    val m = a.groupBy(x => x % 2 == 0)
    m.foreach(x => {
      print("map.key: " + x._1)
      println(x._2.mkString(", map.value: (", ", ", ")"))
    })
    println("\n************** " + "Array 的sub" + " **************")

    val n = a.sliding(2,4) // n 是 iterator
    println(n.getClass)

  }

}
