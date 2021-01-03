package com.ksptooi.jmp33.repository

import com.ksptooi.jmp33.entities.DomCategory
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DomCategoryRepository:JpaRepository<DomCategory,Int> {
}