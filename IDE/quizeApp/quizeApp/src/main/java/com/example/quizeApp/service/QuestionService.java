package com.example.quizeApp.service;

import com.example.quizeApp.dao.QuestionDao;
import com.example.quizeApp.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;

    // GetAll
    public List<Question> getAllQuestions() {
        return questionDao.findAll();
    }

    // GetByCategory
    public List<Question> getQuestionByCategory(String category) {
        return questionDao.findByCategory(category);
    }

    // AddQuestion
    public String addQuestion(Question question) {
        questionDao.save(question);
        return  "success";
    }


}
