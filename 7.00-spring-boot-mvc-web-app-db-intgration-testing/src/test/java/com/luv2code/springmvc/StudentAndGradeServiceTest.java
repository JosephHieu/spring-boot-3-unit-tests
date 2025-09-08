package com.luv2code.springmvc;

import com.luv2code.springmvc.models.CollegeStudent;
import com.luv2code.springmvc.repository.StudentDao;
import com.luv2code.springmvc.service.StudentAndGradeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@TestPropertySource("/application.properties")
public class StudentAndGradeServiceTest {

    @Autowired
    private StudentAndGradeService studentService;

    @Autowired
    private StudentDao studentDao;

    @Test
    public void createStudentService() {

        studentService.createStudent("Hieu", "Hoang", "hieu@gmail.com");

        CollegeStudent student = studentDao.findByEmailAddress("hieu@gmail.com");

        assertEquals("hieu@gmail.com", student.getEmailAddress(), "find by email");
    }
}
