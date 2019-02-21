# Spring JDBC

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](/LICENSE)


Spring JDBC example with REST API using Spring Boot and Kotlin. 
Using Spring JDBC give us more flexibility to conduct the native SQL query and low 
level access.

The output of project is the Web REST API endpoint.

## Tech Stack

- Java8 (JDK 8 update 171), as application runtime machine, please install this first.
- [Kotlin 1.2.71](https://kotlinlang.org/), the code main language.
- [Spring Boot 1.5.19 RELEASE](http://spring.io/projects/spring-boot), application and web framework.
- [Gradle 4.8.1](https://gradle.org/), build system and dependencies management.
- [H2DB](http://www.h2database.com/html/main.html), embeded and in memory RDBMS engine.
- [Undertow Web Server](http://undertow.io/), embeded web server.
- [REST-Assured](http://rest-assured.io/), REST endpoint assertion libs.
- [AssertJ](http://joel-costigliola.github.io/assertj/), fluent object assertion libs.
- [Mockito](https://site.mockito.org/), object mocking and assertion libs.
- [Jacoco](https://www.eclemma.org/jacoco/), coverage test and report libs.

## Use Case and User Story

This project use `Employee` model class as its example, and consist of fields:

- `empId (String)`, employee's ID, the primary key.
- `firstName (String)`, the first name.
- `lastName (String)`, the last name.
- `birthDate (Date)`, the birth date.
- `salary (Long)`, the monthly take home pay before deduction.

### User Story

In this project I tried to apply 
[Test Driven Development (TDD)](https://en.wikipedia.org/wiki/Test-driven_development), 
moreover  I use top-down approach, so I start to write the test suite from 
Integration test first, then going down to Unit test, and so on.

In order to ease the TDD process, first we need to have a proper user story, and 
here are some stories to guide the test suite later.

#### 1. Scenario: Get list of employee

```concept
Given: employee's status_active is true.
When: access get employee list endpoint.
Then: return list of active employee.
```

```concept
Given: employee's status_active is false.
When: access get employee list endpoint.
Then: return list of inactive employee.
```

```concept
Given: none parameter.
When: access get employee list endpoint.
Then: return list of all employee.
```

#### 2. Scenario: Get employee by employee's id

```concept
Given: available employee's id.
When: access get employee by emp_id.
Then: return the employee data.
```

```concept
Given: unavailable employee's id.
When: access get employee by emp_id.
Then: return error not found.
```

## Test and Running Application

_Coming soon.._

## Reference

- [Spring JDBC](https://www.baeldung.com/spring-jdbc-jdbctemplate)


## Copyright and License

Copyright 2019 Maikel Chandika (mkdika@gmail.com). Code released under the
MIT License. See [LICENSE](/LICENSE) file.