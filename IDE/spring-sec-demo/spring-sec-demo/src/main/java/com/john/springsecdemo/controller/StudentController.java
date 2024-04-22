package com.john.springsecdemo.controller;

import com.john.springsecdemo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students = new ArrayList<>(List.of(
            new Student(1,"John","Java"),
            new Student(2,"Jane", "Golang")
    ));

    @GetMapping("students")
    public List<Student> getStudents(){
        return students;
    }

    /* Get csrf-token */
    @GetMapping("csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    /* Create Student */
    @PostMapping("students")
    public void addStudent(@RequestBody Student student){
        students.add(student);
    }
}
