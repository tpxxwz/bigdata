package com.wjjzst.bigdata.scala_learn._01basic

object _02Variable {
  def main(args: Array[String]): Unit = {
    var i = 1000;
    var str = "张三";
    var price: Double = 222.22

    println(s"Type: ${i.getClass}, Value: $i")
    println(s"Type: ${str.getClass}, Value: $str")
    println(s"Type: ${price.getClass}, Value: $price")
    // str = 2000; 推导出来了类型 就不能随意赋值了

    val const_i = 2000;
    println(s"Type: ${const_i.getClass}, Value: $const_i")
  }

}
