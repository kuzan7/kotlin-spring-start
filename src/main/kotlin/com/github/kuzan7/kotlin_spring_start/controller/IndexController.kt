package com.github.kuzan7.kotlin_spring_start.controller

import com.github.kuzan7.kotlin_spring_start.entity.MyResult
import com.github.kuzan7.kotlin_spring_start.service.IndexService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class IndexController {

  @Autowired
  private lateinit var indexService : IndexService

  @GetMapping("index")
  fun index() = MyResult.ok(indexService.index())

}

