package com.atguigu.scala1015

/**
 * Author atguigu
 * Date 2020/4/10 11:48
 */
object CollectionDemo2 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        println(list1.head)  // 拿出来第一个
        println(list1.last)  // 拿出来最后一个
        println(list1.tail)  // 干掉第一个
        println(list1.init)  // 干掉最后一个
    
        println(list1.take(2))  // 取出来前3个
        println(list1.drop(2))
        println(list1.takeRight(2))
        println(list1.dropRight(2))
        
        
    }
}
