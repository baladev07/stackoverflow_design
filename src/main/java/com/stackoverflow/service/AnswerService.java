package com.stackoverflow.service;

import com.stackoverflow.models.Comment;
import com.stackoverflow.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService implements UserInteractionService{


    AnswerRepository answerRepository;

    CommentService commentService;


    @Autowired
    AnswerService(AnswerRepository answerRepository,CommentService commentService)
    {
       this.answerRepository = answerRepository;
       this.commentService = commentService;
    }

    public void addComment(Long answerId,String comment)
    {
        Comment commentObj = new Comment();
        commentService.saveComment(commentObj);
    }


    @Override
    public void upVote(Long entityId,boolean isLiked) {

    }

    @Override
    public void flag(Long entityId,boolean isFlagged) {

    }
}
