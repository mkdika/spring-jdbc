package com.mkdika.springjdbc.employee

import java.util.*

data class Employee (

        val empId: Int,

        val firstName: String,

        val lastName: String,

        val birthDate: Date,

        val salary: Double,

        val joinDate: Date,

        val statusActive: Boolean
)