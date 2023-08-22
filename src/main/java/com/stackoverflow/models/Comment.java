package com.stackoverflow.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class Comment {



    @Id
    long commentId;

    String text;

    long creationTime;

    boolean isFlagged;

    int voteCount;



    @ManyToOne
    @JoinTable(
            name = "comment_question",
            joinColumns = @JoinColumn(name = "commentId"),
            inverseJoinColumns = @JoinColumn(name = "questionId")
    )
    private Question questions;


    @ManyToOne
    @JoinTable(
            name = "comment_answer",
            joinColumns = @JoinColumn(name = "commentId"),
            inverseJoinColumns = @JoinColumn(name = "answerId")
    )
    private Answer answer;

//    @ManyToOne
//    @JoinColumn(name = "questionId")
//    Question questionId;

}
