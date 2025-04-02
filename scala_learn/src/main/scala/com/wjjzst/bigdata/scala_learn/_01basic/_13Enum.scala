package com.wjjzst.bigdata.scala_learn._01basic

object WeekDay extends Enumeration {
  type WeekDay = Value
  //  val Monday = Value("Monday")
  //  val Tuesday = Value("Tuesday")
  //  val Wednesday = Value("Wednesday")
  //  val Thursday = Value("Thursday")
  //  val Friday = Value("Friday")
  //  val Saturday = Value("Saturday")
  //  val Sunday = Value("Sunday")
  val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value

  def isWeekend(wd: WeekDay.Value): Boolean = {
    wd match {
      case WeekDay.Saturday => true
      case WeekDay.Sunday => true
      case _ => false
    }
  }
}

object _13Enum {
  def main(args: Array[String]): Unit = {
    val monday: WeekDay.WeekDay = WeekDay.Monday
    val sunday: WeekDay.WeekDay = WeekDay.withName("Sunday")
    println(sunday.id) // 6
    println(monday) // Monday
    println(sunday) // Sunday
    println(WeekDay(1)) // Tuesday
    println(WeekDay.maxId) // 7

    println(WeekDay.isWeekend(monday))
    println(WeekDay.isWeekend(sunday))
  }
}


