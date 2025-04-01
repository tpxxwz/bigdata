package com.wjjzst.bigdata.scala_learn._01basic

//  ListBuffer 才是真正的ArrayList
object _09Array {

  def main(args: Array[String]): Unit = {
    val a1 = Array[Int](1, 2, 3, 4)
    val a2 = Array[Int](100, 200, 300, 400)
    var a = Array.concat(a1, a2)
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

    val n = a.slice(2, 4) // n 是 iterator
    println(n.mkString("Array n(", ", ", ")"))
    println("\n************** " + "Array 的排序 " + " **************")

    println(a.mkString("Array a(", ", ", ")"))
    val asc_sort = a.sorted // asc
    println(asc_sort.mkString("Array asc_sort(", ", ", ")"))
    val desc_sort = a.sorted(Ordering.Int.reverse) // desc
    println(desc_sort.mkString("Array desc_sort(", ", ", ")"))

    val a5 = Array[Int](11, 22, 3, 4)
    val sortWith = a5.sortWith(_ < _) // < = asc,  > = desc
    println(sortWith.mkString("Array sortWith(", ", ", ")"))
    val sortWithDesc = a5.sortWith(_ > _) // < = asc,  > = desc
    println(sortWithDesc.mkString("Array sortWithDesc(", ", ", ")"))
    val sortBy = a5.sortBy(x => x) // asc
    println(sortBy.mkString("Array sortBy(", ", ", ")"))
    val sortByDesc = a5.sortBy(x => x * -1)
    println(sortByDesc.mkString("Array sortByDesc(", ", ", ")"))

    println("\n************** " + "quiz word sorted by word length " + " **************")
    // 需求：按照单词的长度进行排序
    val s = "The Apache Hadoop software library is a framework that allows for the distributed processing of large data sets across clusters of computers using simple programming models."
    val results1 = s.split(" ").sortWith((x, y) => x.length > y.length)
    results1.foreach(println(_))
    // results1.foreach(println)
  }

}
