package com.stackoverflow.service;

import com.stackoverflow.models.Account;
import com.stackoverflow.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Provider;


@Service
public class ModeratorService extends MemberService{

    @Autowired
    ModeratorService(QuestionService questionService,AccountsService accountService,AnswerService answerService,CommentService commentService) {
        super(questionService,accountService,answerService,commentService);
    }


    public boolean closeQuestion()
    {
        return false;
    }

    public boolean undeleteQuestion()
    {
        return false;
    }

}
