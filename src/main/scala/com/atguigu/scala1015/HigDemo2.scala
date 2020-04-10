package com.atguigu.scala1015

/**
 * Author atguigu
 * Date 2020/4/10 13:45
 */
object HigDemo2 {
    def main(args: Array[String]): Unit = {
        val map1: Map[String, Int] = Map("a" -> 10, "b" -> 20, "c" -> 30)
        val map2: Map[String, Int] = Map("a" -> 100, "c" -> 300, "d" -> 400)
        // foldLeft(聚合)  scanLeft(聚合, 把中间结果也会给保留下来)
        // 合并map1和map2
        // 方法1:
        var result: Map[String, Int] = map1
        for ((k, v) <- map2) {
            val v1 = result.getOrElse(k, 0)
            result += k -> (v + v1)
            
        }
        println(result)
        // 方法2: 用foldLeft
        val map3 = map1.foldLeft(map2) {
            case (map, (k, v)) =>
                map + (k -> (v + map.getOrElse(k, 0)))
        }
        println(map3)
        // scanLeft().last  === foldLeft
        val list = map1.scanLeft(map2) {
            case (map, (k, v)) =>
                map + (k -> (v + map.getOrElse(k, 0)))
        }.last
        println(list)
        
        val list1 = List(30, 50, 70, 60, 10, 20)
    }
}
