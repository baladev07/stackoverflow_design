package com.stackoverflow.service;


import com.stackoverflow.models.Answer;
import com.stackoverflow.models.Comment;
import com.stackoverflow.models.Question;
import com.stackoverflow.repository.AnswerRepository;
import com.stackoverflow.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService implements UserInteractionService{


    AnswerRepository answerRepository;


    QuestionRepository questionRepository;

   CommentService commentService;



    @Autowired
    QuestionService(AnswerRepository answerRepository, QuestionRepository questionRepository, CommentService commentService)
    {
       this.answerRepository = answerRepository;
       this.questionRepository = questionRepository;
       this.commentService = commentService;
    }


    public void close()
    {

    }

    public void unDelete()
    {

    }

    public void addAnswer(long questionID)
    {
        Question question = getQuestionObj(questionID);
        Answer answer = new Answer();
        answer.setQuestionId(question);
        answerRepository.save(answer);

    }

    public void addComment(Long questionID,String comment)
    {
        Comment commentObj = new Comment();
        commentService.saveComment(commentObj);
    }

    public Question getQuestionObj(Long questionID)
    {
       return null;
    }

    public List<Question> getQuestions()
    {
        return null;
    }

    @Override
    public void upVote(Long entityId,boolean isLiked) {


    }

    @Override
    public void flag(Long entityId,boolean isFlagged) {

    }

    public void saveQuestion(Question question)
    {
        questionRepository.save(question);
    }
}
