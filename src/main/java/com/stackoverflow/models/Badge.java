package com.stackoverflow.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Badge {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_entity_seq")
    @SequenceGenerator(name = "my_entity_seq", allocationSize = 10, initialValue = 10000001)
    long badgeId;

    String name;

    String description;


    @ManyToMany
    @JoinTable(name = "user_badge",
            joinColumns = @JoinColumn(name = "accountId"),
            inverseJoinColumns = @JoinColumn(name = "badgeId"))
    List<Account> accounts;

}
