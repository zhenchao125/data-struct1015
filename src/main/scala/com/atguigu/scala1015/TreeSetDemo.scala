package com.atguigu.scala1015

import scala.collection.immutable.TreeSet


/**
 * Author atguigu
 * Date 2020/4/10 11:32
 */
case class User1( age: Int, name: String) extends Ordered[User1]{
    override def compare(that: User1): Int = this.age - that.age
}
object TreeSetDemo {
    def main(args: Array[String]): Unit = {
//        val set = TreeSet(8, 10, 4, 1, 9)(Ordering.Int.reverse)
        /*implicit val ord: Ordering[User1] = new Ordering[User1](){
            override def compare(x: User1, y: User1): Int = y.age - x.age
        }*/
        val set = TreeSet(User1(10, "zs"), User1(20, "lisi"))
        println(set)
    }
}
/*
自动安装升序来

 */