package com.stackoverflow.dto;


import lombok.Data;

@Data
public class SignUpInfo {

    int status;

    String name;

    String email;

    String phone;

    int accountType;

}
