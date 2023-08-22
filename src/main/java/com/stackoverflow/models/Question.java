package com.stackoverflow.models;


import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Component
@Scope("prototype")
@Data
public class Question {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_entity_seq")
    @SequenceGenerator(name = "my_entity_seq", allocationSize = 10, initialValue = 10000001)
    long questionId;

    public String title;

    public String description;

    public int viewCount;

    public int voteCount;

    long creationTime;

    long updatedTime;

    int questionStatus;

    boolean isFlagged;


    @ManyToMany
    @JoinTable(name = "question_tag",
            joinColumns = @JoinColumn(name = "question_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id"))
    List<Tag>tags;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="account_id",updatable = false)
    Account account;

}
