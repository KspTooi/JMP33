package com.ksptooi.jmp33.controller

import com.ksptooi.jmp33.service.DomCategoryService
import com.ksptooi.jmp33.service.DomService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
open class GeneralController {

    @Autowired
    open lateinit var service:DomService

    @Autowired
    open lateinit var categoryService: DomCategoryService

    @RequestMapping("/list")
    fun list():Any{
        return service.list()
    }

    @RequestMapping("/insert")
    fun insert(@RequestBody insert:HashMap<Any,Any>):Any{
        return service.insert(insert)
    }

    @RequestMapping("/category")
    fun categoryList():Any{
        return categoryService.list()
    }

    @RequestMapping("/remove")
    fun remove(@RequestBody insert:HashMap<Any,Any>):Any{
        return service.remove(insert)
    }



}