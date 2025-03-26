package com.wjjzst.bigdata.scala_learn._01basic

object _03Function {

  def main(args: Array[String]): Unit = {
    println("**************" + "square" + "**************")
    println(square(20))
    println("\n**************" + "printByValue" + "**************")
    printByValue(square(10))
    println("\n**************" + "printByName" + "**************")
    printByName(square(10))
    println("\n**************" + "printByFunction" + "**************")
    printByFunction(() => square(10))
  }

  private def square(x: Int): Int = {
    println("Computing... ")
    println(x)
    x * x
  }

  private def printByValue(x: Any): Unit = {
    println(x)
    println(x)
  }

  private def printByName(x: => Any): Unit = {
    println(x)
    println(x)
  }

  private def printByFunction(x: () => Any): Unit = {
    println(x())
    println(x())
  }

}
