package com.atguigu.datastruct

package object sort {
    def swap(arr: Array[Int], i:Int, j: Int): Unit ={
        val tmp = arr(i)
        arr(i) = arr(j)
        arr(j) = tmp
    }
}
