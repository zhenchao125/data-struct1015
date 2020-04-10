package com.atguigu.scala1015

/**
 * Author atguigu
 * Date 2020/4/10 10:35
 */
object ApplyDemo {
    def main(args: Array[String]): Unit = {
        val a = new A
        a.foo()
        a(10)   // 等价于 a.apply(10)
        
        A()  // A.apply()
    }
}
object A{
    // 一般是返回伴生类的对象. 好处就是创建伴生类对象的时候, 可以省略new
    // 样例类就是这么玩
    def apply() = {
        println("A apply...")
    }
}

class A{
    def foo(): Unit ={
        println("foo...")
    }
    
    def apply(n:Int) = {
        println(n)
    }
}
