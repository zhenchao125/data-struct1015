package com.atguigu.scala1015

/**
 * Author atguigu
 * Date 2020/4/10 15:44
 */
object Sqrt {
    // 返回值必须是Option
    def unapply(n: Double) = if (n >= 0) Some(math.sqrt(n)) else None
}


class AA(val a: Int, val b: String)

object AA {
    // 保证不用new可以创建伴生类的对象
    def apply(a: Int, b: String) = new AA(a, b)
    
    // 模式匹配的时候, 会自动调用
    def unapply(aa: AA) = Some((aa.a, aa.b))
}

object ObjMatch {
    def main(args: Array[String]): Unit = {
        /*val n: Double = -9
        n match {
                // 会去调用 Sqrt这个对象的unapply方法
            case Sqrt(a) => println(a)
            case _ =>
        }*/
        
        val aa: AA = AA(10, "abc")
        aa match {
            case AA(a, b) =>
                println(a)
                println(b)
        }
    }
}

/*case class AA(a:Int, b:String)*/



