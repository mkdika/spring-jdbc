package com.mkdika.springjdbc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringJdbcApplication

fun main(args: Array<String>) {
	SpringApplication.run(SpringJdbcApplication::class.java, *args)
}

