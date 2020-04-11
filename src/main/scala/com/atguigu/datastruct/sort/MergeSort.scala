package com.atguigu.datastruct.sort

import scala.util.Random

/**
 * Author atguigu
 * Date 2020/4/11 15:52
 */
object MergeSort {
    def randomArr() = {
        val random = new Random()
        (1 to 1000000).map(_ => random.nextInt(1000000)).toArray
    }
    def main(args: Array[String]): Unit = {
        
    }
}
