package com.wjjzst.bigdata.scala_learn._01basic

// Nil extends List[Nothing] Nil 是 List[Nothing] 的唯一实例，代表 空列表 等效于 List()
// None extends Option[Nothing] None 是 Option[Nothing] 的唯一实例，表示 没有值。
object _16NilAndNone {

  def main(args: Array[String]): Unit = {
    println("************** " + "Nil" + " **************")
    //    import scala.collection.immutable.Nil
    println(Nil.length) // 0
    println(Nil == List()) // true

    println("\n************** " + "None" + " **************")
    // Option
    val s1: Option[Int] = scala.util.Try("1234a".toInt).toOption // 报错
    val s2: Option[Int] = scala.util.Try("1234".toInt).toOption // 正常
    println(s1) // None None不包含任何值，就是一个标识
    println(s1.getOrElse("haha")) // 没有值返回给Else指定的 "haha"
    println(s2) // Some(1234) Some里面包含了具体的值
    println(s2.get) // Some(1234)
    //    import scala.None
    println(None)
    val s3: Option[Int] = scala.util.Try("1234a".toInt).toOption
    println(s1 == s3) // true

    val s4: String = null // 不建议
    var s5: Option[String] = None // 建议
    s5 = Some("bw")
    s5 match {
      case Some("bw") => println(s5.get)
      case _ => println("not value")
    }
    println("\n************** " + "None from def" + " **************")
    println(getAsStringMaybe(123))
    println(getAsStringMaybe(-123))

    println("\n************** " + "模式匹配" + " **************")
    printResult(123)
    printResult(-123)
  }

  private def getAsStringMaybe(num: Int): Option[String] = {
    if (num >= 0) Some("a number")
    else None
  }

  private def printResult(num: Int): Unit = {
    // 使用模式匹配比使用if else 更加方便一些
    getAsStringMaybe(num) match {
      case Some(str) => println(str)
      case None => println("No String")
    }
  }

}
