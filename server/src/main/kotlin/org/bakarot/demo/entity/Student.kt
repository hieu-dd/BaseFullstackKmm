package org.bakarot.demo.entity

import jakarta.persistence.*


@Entity
@Table(name = "student")
data class Student(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    var id: Long,

    @Column(name = "last_name")
    var lastName: String,

    @Column(name = "first_name")
    var firstName: String,

    @Column(name = "email")
    var email: String,
)