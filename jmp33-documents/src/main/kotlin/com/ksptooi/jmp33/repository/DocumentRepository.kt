package com.ksptooi.jmp33.repository

import com.ksptooi.jmp33.entities.Document
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface DocumentRepository:JpaRepository<Document,Int> {



}