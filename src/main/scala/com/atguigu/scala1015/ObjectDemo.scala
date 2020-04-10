package com.atguigu.scala1015

/**
 * Author atguigu
 * Date 2020/4/10 10:11
 */
object ObjectDemo {
    def main(args: Array[String]): Unit = {
        val user = new User(10, "a", "m")
        println(user.age)
        
    }
}

class User(val age: Int, var name: String, sex: String){
    // 代码
    println("主构造")
    
    // 辅构造
    def this(){
        
        // 首行必须是主构造
        this(10, "b", "F")
        
    }
    // a是一个只能在当前的构造函数内用的普通的常量
    def this(a: Int){
        this()
        println(a)
    }
    def foo()= {
        println(sex)  // 更加函数式
        println(this.sex)  // 更加面向对象
        
    }
}