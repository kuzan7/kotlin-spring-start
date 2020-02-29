package com.github.kuzan7.kotlin_spring_start.entity

const val OK = "0"
const val ERROR = "-1"

data class MyResult(val code: String, val message: String?, val data: Any?, val timeStamp: Long = System.currentTimeMillis()) {

  companion object {
    fun ok(data: Any?) : MyResult {
      return MyResult(OK, null, data)
    }

    fun error(message: String?) : MyResult {
      return MyResult(ERROR, message, null)
    }
  }

}



