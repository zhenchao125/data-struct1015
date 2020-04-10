package com.atguigu.scala1015

/**
 * Author atguigu
 * Date 2020/4/10 14:51
 */
object OptionDemo {
    def main(args: Array[String]): Unit = {
        // option: 语义  表示一个结果有可能有值, 也可能没有
               // val opt: Option[Int] = Some(10)
//        val opt: Option[Int] = None
        /*val opt1 = opt.map(x => x * x)
        println(opt1)*/
        
        /*val a = opt match {
            case Some(v) =>
                Some(v * v)
            case _ =>
                None
            
        }
        println(opt)*/
        
        val arr1 = List(Some(10), None, Some(100))
//        val arr2 = arr1.filter(_ != None).map(_.get)
        val arr2 = arr1.filter(_.isDefined).map(_.get)
//        val arr2 = arr1.collect{
//            case Some(v) => v
//        }
        println(arr2)
    }
}
