package com.stackoverflow.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Tag {

    @Id
    long tagId;

    String name;

    String description;

    @ManyToMany(mappedBy = "tags")
    List<Question> questions;



}
