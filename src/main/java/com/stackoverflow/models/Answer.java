package com.stackoverflow.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Answer {


    @Id
    long answerId;

    String answerText;

    boolean accepted;

    int voteCount;

    boolean isFlagged;

    long createTime;

    @ManyToOne
    @JoinColumn(name = "questionId")
    Question questionId;




}
