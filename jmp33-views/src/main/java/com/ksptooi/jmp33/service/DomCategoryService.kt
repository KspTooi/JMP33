package com.ksptooi.jmp33.service

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient(value = "DOCUMENTSCATEGORY",path = "/category/v1")
interface DomCategoryService {

    @RequestMapping("/list")
    fun list():Any

}