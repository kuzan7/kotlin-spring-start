package com.github.kuzan7.kotlin_spring_start

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class Application

fun main(args: Array<String>) {
  //此处的*和指针没半毛钱关系哦，这是一个展开（spread）
  //https://kotlinlang.org/docs/reference/functions.html#variable-number-of-arguments-varargs
  runApplication<Application>(*args)
}
