package com.atguigu.scala1015

/**
 * Author atguigu
 * Date 2020/4/10 16:22
 */
class CC[T] {
    def eat(t: T) = println(t)
}

object ContextGeneric {
    implicit val cc: CC[Int] = new CC[Int]
    
    def main(args: Array[String]): Unit = {
        foo[Int](10) //  CC[Int]
        
    }
    
    /*def foo(implicit a: CC[Int]) = {
        a.eat(10)
    }*/
    
    def foo[T: CC](n: T) = {
        // [T: CC] 等价于必须得有一个隐式值   CC[T], 如果要用这个隐式值, 怎么办?  冥界召唤
        val a = implicitly[CC[T]]
        a.eat(n)
    }
    
}

/*
隐式参数和隐式值

[T: CC] 等价于必须得有一个隐式值   CC[T]
 */