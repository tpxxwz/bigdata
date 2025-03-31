package com.wjjzst.bigdata.scala_learn._01basic


object _07Tuple {

  def main(args: Array[String]): Unit = {
    // tuple的数据内容是不可变的
    val t1 = ("zs", "beijing", 70)
    // tuple后面的数字表示可以存放的数据个数
    val t3 = new Tuple3[String, String, Int]("lisi", "深圳", 33)
    // 不指定就根据数据内容反推类型
    val t4 = new Tuple4("tom", "shanghai", 22, 20)
    // tuple 的长度不能超过22，定义为 new Tuple23 就报错

    // 遍历
    println("\n************** " + "tuple 遍历" + " **************")
    t4.productIterator.foreach { x =>
      println(x)
    }

    t4.productIterator.map {
      x => x.+("!!!") // +()
    }.foreach {
      s => println(s)
    }
    // 取值
    println("\n************** " + "tuple 取值" + " **************")
    println(t1._1)
    println(t1._2)
    println(t1._3)

    // 提取数据
    println("\n************** " + "tuple 提取数据" + " **************")
    val (name, addr, age) = t3
    println(addr)

    // 动态定义
    println("\n************** " + "二元tuple 动态定义" + " **************")

    def mike = "mike" -> 5 // 等效 new Tuple2("mike", 5) 只能是二元tuple

    println(mike.getClass) // class scala.Tuple2
  }


}
