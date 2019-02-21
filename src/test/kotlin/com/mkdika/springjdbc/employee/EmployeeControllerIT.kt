package com.mkdika.springjdbc.employee

import com.mkdika.springjdbc.SpringJdbcApplication
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.DirtiesContext
import org.springframework.test.context.junit4.SpringRunner


@RunWith(SpringRunner::class)
@SpringBootTest(classes = arrayOf(SpringJdbcApplication::class),
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class EmployeeControllerIT {

    @Test
    fun `given status active is true when access get employee list then return list of active employee`() {

    }

    @Test
    fun `given status active is false when access get employee list then return list of inactive employee`() {

    }

    @Test
    fun `given none when access get employee list then return list of all employee`() {

    }

    @Test
    fun `access wrong get employee uri then return error not found 404`() {

    }

    @Test
    fun `given available employee id when access get employee by empId then return employee data`() {

    }

    @Test
    fun `given unavailable employee id when access get employee by empId then return error not found 404`() {

    }


}