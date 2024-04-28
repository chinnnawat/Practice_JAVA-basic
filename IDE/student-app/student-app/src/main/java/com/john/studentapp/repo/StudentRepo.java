package com.john.studentapp.repo;

import com.john.studentapp.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
}
