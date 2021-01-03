package com.ksptooi.jmp33.service

import com.ksptooi.jmp33.entities.Document
import com.ksptooi.jmp33.repository.DocumentRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.transaction.TransactionScoped
import javax.transaction.Transactional

@Service
@Transactional(rollbackOn = [Exception::class])
open class DomServiceBlock:DomService {

    @Autowired
    open lateinit var mapper:DocumentRepository


    override fun list(): List<Document> {
        return mapper.findAll()
    }


    override fun insert(dom: Document) {
        mapper.save(dom);
    }

    override fun remove(dom: Document) {
        mapper.delete(dom)
    }

}