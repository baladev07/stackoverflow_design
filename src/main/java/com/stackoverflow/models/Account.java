package com.stackoverflow.models;

import com.stackoverflow.account_enums.AccountStatus;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_entity_seq")
    @SequenceGenerator(name = "my_entity_seq", allocationSize = 10, initialValue = 10000001)
    long accountId;
    int status;

    String name;

    String email;

    String phone;

    int accountType;


    @ManyToMany
    List<Badge> badges;


    protected void method()
    {

    }

}
