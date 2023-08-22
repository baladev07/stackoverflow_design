package com.stackoverflow.service;

import com.stackoverflow.account_enums.EntityType;
import com.stackoverflow.models.Account;
import com.stackoverflow.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;




@Service
public class MemberService {

    AccountsService accountService;

    QuestionService questionService;

    AnswerService answerService;

    CommentService commentService;



    @Autowired
    public MemberService(QuestionService questionService,AccountsService accountService,AnswerService answerService,CommentService commentService)
    {
        this.questionService = questionService;
        this.accountService = accountService;
        this.answerService = answerService;
        this.commentService = commentService;

    }



    @Transactional
    public void createQuestion(String description,String title,String username) {
        Question questionObj = new Question();
        questionObj.setDescription(description);
        Account account = accountService.getAccountByName(username);
        questionObj.setAccount(account);
        questionObj.setTitle(title);
        questionObj.setCreationTime(System.currentTimeMillis());
        questionService.saveQuestion(questionObj);
    }

    protected void createTag()
    {

    }

    public void addAnswer(Long questionId)
    {

    }

    public void addComment(EntityType entityType,Long entityId,String comment)
    {

        if(EntityType.QUESTION.equals(entityType))
        {
            questionService.addComment(entityId,comment);
        }
        else if(EntityType.ANSWER.equals(entityType))
        {
            answerService.addComment(entityId,comment);
        }
        return;
    }

    public void upVote(EntityType entityType,Long entityId,boolean upVote)
    {
        if(EntityType.QUESTION.equals(entityType))
        {
            questionService.upVote(entityId,upVote);
        }
        else if(EntityType.ANSWER.equals(entityType))
        {
            answerService.upVote(entityId,upVote);

        }
        else {
            commentService.upVote(entityId,upVote);
        }
    }

    public void flag(EntityType entityType,Long entityId,boolean isFlagged)
    {
        if(EntityType.QUESTION.equals(entityType))
        {
            questionService.flag(entityId,isFlagged);
        }
        else if(EntityType.ANSWER.equals(entityType))
        {
            answerService.flag(entityId,isFlagged);

        }
        else {
            commentService.flag(entityId,isFlagged);
        }
    }


}
