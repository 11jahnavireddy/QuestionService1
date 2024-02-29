package com.example.QuestionService1.service;

import com.example.QuestionService1.model.Question;
import com.example.QuestionService1.repository.questionrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Questionservice {
    @Autowired
    private questionrepo qrepo;
    public Question addQuestion(Question question) {
        return qrepo.save(question);
    }
}