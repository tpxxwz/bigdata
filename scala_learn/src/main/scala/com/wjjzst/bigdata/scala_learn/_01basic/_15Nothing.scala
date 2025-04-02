package com.wjjzst.bigdata.scala_learn._01basic

// Nothing是所有类型的字类型
// Nothing没有实例
// 任何Nothing的collection都必须为空
// 任何返回Nothing的方法都不会正常返回，例如method抛出异常
object _15Nothing {

  def main(args: Array[String]): Unit = {
    val emptyStringList1: List[String] = List[Nothing]() // List()
    val emptyStringList2: List[Int] = List[Nothing]() // List()
    //    val emptyStringList3: List[String] = List[Nothing]("aaa", "bbb", "ccc") // 不能创建  Nothing 没有具体实例

    try {
      val result = divide(10, 0)
      println(s"Result: $result") // This line is never reached when b=0
    } catch {
      case e: RuntimeException => println(s"Caught exception: ${e.getMessage}")
    }
  }


  private def alwaysFail(message: String): Nothing = {
    throw new RuntimeException(message)
    // This line is never reached
  }

  def divide(a: Int, b: Int): Int = {
    val message = "Division by zero!"
    if (b == 0) alwaysFail(message)
    else a / b
  }
}
