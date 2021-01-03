package com.ksptooi.jmp33.service

import com.ksptooi.jmp33.entities.Document
import kotlin.jvm.Throws

interface DomService {

    //列表
    fun list():List<Document>

    //添加
    @Throws(Exception::class)
    fun insert(dom:Document)

    //删
    @Throws(Exception::class)
    fun remove(dom:Document)

}