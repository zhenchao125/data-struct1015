package com.atguigu.scala1015

/**
 * Author atguigu
 * Date 2020/4/10 14:15
 */
object HighDemo3 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, "a", false)
        /*// 集合有个方法 collect 方法, 这个接收偏函数
        val list2 = list1.collect{
            case a:Int => a * a  // 这里不是用的模式匹配, 只是使用了模式匹配的语法
        }
        println(list2)*/
        val f = new PartialFunction[Any, Int] {
            // 偏函数: 当返回值是true, 才会交给Apply进行处理
            override def isDefinedAt(x: Any): Boolean = x.isInstanceOf[Int]
            
            override def apply(v1: Any): Int = {
                val x = v1.asInstanceOf[Int]
                x * x
            }
            
        }
        val list2 = list1.collect(f)
        println(list2)
    
        list2.
        
    }
}

/*
用大括号括起来的一个或多个case语句就是一个偏函数



 */