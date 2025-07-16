package com.Ranjeet.Quiz.App.Service;

import com.Ranjeet.Quiz.App.Dao.QuizDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;
}
