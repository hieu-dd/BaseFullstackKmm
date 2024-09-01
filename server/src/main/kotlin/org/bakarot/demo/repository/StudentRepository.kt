package org.bakarot.demo.repository

import org.bakarot.demo.entity.Student
import org.springframework.data.jpa.repository.JpaRepository

interface StudentRepository:JpaRepository<Student, Long> {
}