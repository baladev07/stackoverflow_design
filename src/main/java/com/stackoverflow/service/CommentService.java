package com.stackoverflow.service;

import com.stackoverflow.models.Comment;
import com.stackoverflow.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService implements UserInteractionService {

    CommentRepository commentRepository;


    @Autowired
    CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;

    }


    public Comment getCommentObj(long commentId)
    {
         return null;
    }

    public void saveComment(Comment comment)
    {

    }

    @Override
    public void upVote(Long entityId,boolean isLiked) {

    }

    @Override
    public void flag(Long entityId,boolean isFlagged) {

    }
}
