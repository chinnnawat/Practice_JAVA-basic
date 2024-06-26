package com.john.studentapp.controller;

import com.john.studentapp.model.Student;
import com.john.studentapp.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentRepo repo;


    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
        // find All from DB
        return repo.findAll();
    }
}
