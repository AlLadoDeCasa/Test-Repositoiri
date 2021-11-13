package com.sdeaqui.test

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {

    @RequestMapping("/status")
    fun getStatus() = "OK"
}