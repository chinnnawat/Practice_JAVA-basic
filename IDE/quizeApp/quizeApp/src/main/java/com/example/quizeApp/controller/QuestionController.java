package com.example.quizeApp.controller;

import com.example.quizeApp.models.Question;
import com.example.quizeApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    // GetAll
    @GetMapping("allQuestion")
    public List<Question> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    // GetByCategory
    @GetMapping("category/{category}")
    public List<Question> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }
}
