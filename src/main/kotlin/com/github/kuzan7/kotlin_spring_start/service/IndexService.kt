package com.github.kuzan7.kotlin_spring_start.service

import com.github.kuzan7.kotlin_spring_start.entity.Student
import org.springframework.stereotype.Service

@Service
class IndexService {

  fun index(): Student {
    return Student("San.Zhang", 18)
  }

}
