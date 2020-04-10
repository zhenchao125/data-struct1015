package com.atguigu.scala1015

/**
 * Author atguigu
 * Date 2020/4/10 15:21
 */

object ImplicitDemo {
    
    def main(args: Array[String]): Unit = {
        val aa=new Test
        import aa._
        
        
        val a:Int = 1.1
        println(a)
       
    }
}


