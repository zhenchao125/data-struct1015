package com.atguigu.scala1015

import com.alibaba.fastjson.JSON
import org.json4s.jackson.Serialization

import scala.beans.BeanProperty

/**
 * Author atguigu
 * Date 2020/4/10 10:19
 */
object ObjectDemo2 {
    def main(args: Array[String]): Unit = {
        val person = new Person(10, "zs")
        // java的fastjson序列化.  Person的属性必须有@BeanProperty
//        println(JSON.toJSONString(person, true))
    
        // 使用json4s 转换用来解析和序列化字符串
        import org.json4s.DefaultFormats
        val r: String = Serialization.write(person)(DefaultFormats)
        println(r)
        
    }
}

//class Person(@BeanProperty val age: Int, @BeanProperty var name: String)
class Person(val age: Int,var name: String)