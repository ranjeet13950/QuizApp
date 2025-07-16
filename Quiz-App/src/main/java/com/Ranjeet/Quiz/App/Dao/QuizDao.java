package com.Ranjeet.Quiz.App.Dao;

import com.Ranjeet.Quiz.App.Model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizDao extends JpaRepository<Quiz, Integer> {
}
