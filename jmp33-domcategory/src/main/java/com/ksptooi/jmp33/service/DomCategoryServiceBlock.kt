package com.ksptooi.jmp33.service

import com.ksptooi.jmp33.entities.DomCategory
import com.ksptooi.jmp33.repository.DomCategoryRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
open class DomCategoryServiceBlock:DomCategoryService {

    @Autowired
    open lateinit var repository:DomCategoryRepository


    override fun list(): List<DomCategory> {
        return repository.findAll()
    }

}