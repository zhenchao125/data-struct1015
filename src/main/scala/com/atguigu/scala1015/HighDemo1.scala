package com.atguigu.scala1015

/**
 * Author atguigu
 * Date 2020/4/10 11:56
 */
object HighDemo1 {
    def main(args: Array[String]): Unit = {
        // foreach map
        // flatMap  === map + flatten
        
//        val list = List("abc", "aaa", "ccc")
       /* val list = List(Array(1, 2), Array(10, 20, 30))
        println(list.map(x => x))
        
        // 对集合使用flatten. 一定要保证集合中的元素必须是集合
        val list2 = list.flatten
        println(list2)*/
        
        
        val list1 = List(30, 50, 70, 60, 10, 20)
        val list2 = list1.map(x => List(x, x * x, x * x * x))
        val list3: List[Int] = list2.flatten
        println(list3)
    
        println(list1.flatMap(x => List(x, x * x, x * x * x)))
        
    }
}
