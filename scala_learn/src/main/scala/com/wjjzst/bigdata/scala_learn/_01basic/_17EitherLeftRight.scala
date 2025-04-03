package com.wjjzst.bigdata.scala_learn._01basic

// Either和Option比较相似，也是返回两种类型的值, Option是返回不同的类型
// Right(Some)
// Left(None): 和None的区别，Left除了内容还可以包含一些描述问题。

object _17EitherLeftRight {

  def main(args: Array[String]): Unit = {
    divideBy(100, 20) match {
      case Left(s) => println(s)
      case Right(r) => println("right = %d".format(r))
    }
    divideBy(10, 0) match {
      case Left(s) => println(s)
      case Right(r) => println("right = %d".format(r))
    }
  }

  private def divideBy(x: Int, y: Int): Either[String, Int] = {
    if (y == 0) Left("不能除0")
    else Right(x / y)
  }


}
