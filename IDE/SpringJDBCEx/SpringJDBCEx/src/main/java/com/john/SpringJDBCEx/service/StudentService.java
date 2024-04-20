package com.john.SpringJDBCEx.service;

import com.john.SpringJDBCEx.model.Student;
import com.john.SpringJDBCEx.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public StudentRepo getRepo(){
        return repo;
    }
    public void setRepo(StudentRepo repo){
        this.repo = repo;
    }

    /* Add Student */
    public void addStudent(Student s){
        repo.save(s);
    }

    /* Get Student */
    public List<Student> getStudents(){
        return repo.findAll();
    }
}
