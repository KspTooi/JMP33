package com.ksptooi.jmp33.controller

import com.ksptooi.jmp33.entities.Document
import com.ksptooi.jmp33.service.DomService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
open class GeneralController {

    @Autowired
    open lateinit var service:DomService


    @RequestMapping("/dom/v1/list")
    fun list():Any{

        val ret = HashMap<Any,Any>()

        ret["payload"] = service.list()

        return ret
    }

    @RequestMapping("/dom/v1/insert")
    fun insert(@RequestBody insert:Document):Any{

        val ret = HashMap<Any,Any>()

        service.insert(insert)

        ret["payload"] = "success"

        return ret
    }

    @RequestMapping("/dom/v1/remove")
    fun remove(@RequestBody insert:Document):Any{

        val ret = HashMap<Any,Any>()

        service.remove(insert)

        ret["payload"] = "success"

        return ret
    }


}