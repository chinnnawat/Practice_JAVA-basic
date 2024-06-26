package com.example.quizeApp.dao;

import com.example.quizeApp.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    // findByCategory
    List<Question> findByCategory(String category);
}
