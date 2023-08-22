package com.stackoverflow.controller;


import com.stackoverflow.dto.SignUpInfo;
import com.stackoverflow.repository.AccountsRepository;
import com.stackoverflow.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountsController {

    @Autowired
    AccountsService accountsService;

    @Autowired
    AccountsRepository accountsRepository;


    @PostMapping("/signup")
    public ResponseEntity signUp(@RequestBody SignUpInfo signUpInfo)
    {
         accountsService.createAccount(signUpInfo);
         return ResponseEntity.ok().body("success");
    }


}
