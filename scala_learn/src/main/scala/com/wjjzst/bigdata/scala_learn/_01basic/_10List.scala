package com.wjjzst.bigdata.scala_learn._01basic

import scala.collection.mutable.ListBuffer

// LinkedList
object _10List {

  def main(args: Array[String]): Unit = {
    val l1 = List[Int](1, 2, 34, 5, 6123, 5, 9)
    println("************** " + "List grouped" + " **************")
    val l2 = l1 grouped 3 // 按长度3个分组
    println(l2.getClass) // scala.collection.Iterator
    println(l2.next())
    println(l2.next())

    println("\n************** " + "List sliding" + " **************")
    val l3 = l1 sliding 2 // 数据滑动 会创建一个滑动窗口（Iterator），每次返回 size 个连续元素。
    println(l3.next) // l3.next == l3.next()
    println(l3.next())
    println(l3.next())

    println("\n************** " + "List append element" + " **************")
    println("\n************** " + "List is immutable" + " **************")
    val c1 = List[Char]('a', 'b', 'c', 'd')
    val c2 = 'e' +: c1 // 左侧插入 头部插入元素
    println(c2)
    val c3 = c2 :+ 'f' // 右侧插入 尾部插入元素
    println(c3)
    println("\n************** " + "ListBuffer" + " **************")
    println("\n************** " + "ListBuffer is mutable" + " **************")
    val lb = ListBuffer[Int](1, 2, 3, 4, 5)
    println(lb)
    lb += 100 // 加在尾部
    //    lb.append(100)
    println(lb)
    10 +=: lb // 加在头部
    //    lb.prepend(10)
    println(lb)

    lb ++= List(22, 33) //数组加在尾部
    List(55, 66) ++=: lb //数组加在头部
    println(lb)

  }

}
