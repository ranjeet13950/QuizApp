package com.Ranjeet.Quiz.App.Dao;

import com.Ranjeet.Quiz.App.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question,Integer> {
}
