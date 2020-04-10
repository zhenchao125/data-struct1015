package com.atguigu.scala1015

/**
 * Author atguigu
 * Date 2020/4/10 11:13
 */
object CollectionDemo {
    def main(args: Array[String]): Unit = {
        /*val list1 = List[Int](10, 20) // List[Int].apply()
        val list2 = 100 :: list1 :::list1 // list1.::(10)
        println(list2)
        println(list1(0))   // list1.apply(0)
        val set1= Set[Int]( )  // Set[Int].apply()
        val nil: Nil.type = Nil*/
        
        val map = Map(1 -> 2, 10 -> 20)
        //        println(map(1))
        ////        println(map(30))
        //        println(map.get(30))
        //        println(map.get(1))
        //        map.get(1) match {
        //            case Some(v) =>
        //                println(v)
        //            case None =>
        //                println("None")
        //        }
        //
        //        val v = map.getOrElse(30, 100)
        //        println(v)
        println(getOrElse(map, 1, 100))
        println(getOrElse(map, 30, 100))
    }
    
    def getOrElse(map: Map[Int, Int], key: Int, default: => Int): Int = {
        map.get(key) match {
            case Some(v) => v
            case None => default
        }
    }
    
}
