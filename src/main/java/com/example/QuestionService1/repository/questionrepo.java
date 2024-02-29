package com.example.QuestionService1.repository;

import com.example.QuestionService1.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface questionrepo extends JpaRepository<Question,Integer> {
}
