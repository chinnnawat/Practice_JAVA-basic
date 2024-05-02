package com.example.quizeApp.controller;

import com.example.quizeApp.models.Question;
import com.example.quizeApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;

    // GetAll
    @GetMapping("allQuestion")
    public ResponseEntity<List<Question>> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    // GetByCategory
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category){
        return questionService.getQuestionByCategory(category);
    }

    // AddQuestion
    @PostMapping("add")
    public ResponseEntity<String> addQuestion (@RequestBody Question question){
        return questionService.addQuestion(question);
    }
}
