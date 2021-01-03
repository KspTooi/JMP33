package com.ksptooi.jmp33.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping


@FeignClient("DOCUMENTS",path = "/dom/v1")
interface DomService {

    @RequestMapping("/list")
    fun list():Any

    @RequestMapping("/insert")
    fun insert(insert:Any):Any

    @RequestMapping("/remove")
    fun remove(remove:Any):Any

}