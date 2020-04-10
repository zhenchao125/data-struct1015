package com.atguigu.scala1015

/**
 * Author atguigu
 * Date 2020/4/10 14:52
 */
object EitherDemo {
    def main(args: Array[String]): Unit = {
        // Either 语义: 结果有两种可能, 要么正确要么错误
        val e1: Either[Int, String] = Left[Int, String](100)
        val e2: Either[Int, String] = Right[Int, String]("hello")
        
       /* if (e2.isRight) {
            println(e2.right.get)
        }*/
        e2 match {
            case Left(v) =>
                println("left: " + v)
            case Right(v) =>
                println("right: " + v)
        }
    }
}
