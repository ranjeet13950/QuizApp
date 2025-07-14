package com.Ranjeet.Quiz.App.Controller;

import com.Ranjeet.Quiz.App.Question;
import com.Ranjeet.Quiz.App.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestion")
    public List<Question> getAllQuestion(){
        return questionService.getAllQuestion();
    }


    @GetMapping("Category/{category}")
    public List<Question> getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody Question question){
        return questionService.addQuestion(question);
    }
}
