package com.ksptooi.jmp33.controller

import com.ksptooi.jmp33.service.DomCategoryService
import com.netflix.discovery.converters.Auto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
open class DomCategoryController {

    @Autowired
    open lateinit var service:DomCategoryService

    @RequestMapping("/category/v1/list")
    fun list():Any{

        val ret = HashMap<Any,Any>()

        ret["payload"] = service.list()

        return ret
    }

}