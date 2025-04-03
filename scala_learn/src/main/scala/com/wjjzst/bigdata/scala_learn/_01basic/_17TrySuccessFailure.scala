package com.wjjzst.bigdata.scala_learn._01basic

import scala.util.{Failure, Success, Try}

object _17TrySuccessFailure {
  def main(args: Array[String]): Unit = {
    Try("a123".toInt) match {
      case Success(v) => println("value is %d".format(v))
      case Failure(e) => println("Exception %s".format(e.getMessage))
    }
    //    Try("a123".toInt) match {
    //      case Success(v) => println("value is %d".format(v))
    //      case Failure(e) => throw e
    //    }
    val t: Try[Int] = Success(100)
    val e: Try[Int] = Failure(new Exception("error"))
    println(isSuccess(t))
    println(isSuccess(e))
    val s1: String = "100"
    println(isInt(s1))
  }

  private def isSuccess(z: Try[Int]): Boolean = {
    z match {
      case Success(_) => true
      case _ => false
    }
  }

  private def isInt(s: String): Boolean = Try(s.toInt) match {
    case Success(_) => true
    case _ => false
  }

  //  private def isInt(s: String): Boolean = {
  //    Try(s.toInt) match {
  //      case Success(_) => true
  //      case _ => false
  //    }
  //  }

}
