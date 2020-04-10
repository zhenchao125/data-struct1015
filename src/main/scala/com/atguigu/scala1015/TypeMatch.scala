package com.atguigu.scala1015

object TypeMatch {
    def main(args: Array[String]): Unit = {
        /*val any: Any = 10
        any match {
            case a: Int =>
            
            case b: String =>

            case arr: Array[Int] =>
            case list: List[_] =>
            
        }*/
        
        /*val arr = Array(10, 20, 30)
        arr match {
            case Array(a, b, _) => println(a)
        }*/
        
        val list = List(10, 20, 390, 40, 50)
        list match {
            case a :: b :: c :: d :: e :: Nil =>
                println(a)
            case a :: b =>
                println(a)
                println(b)
        }
    }
}
