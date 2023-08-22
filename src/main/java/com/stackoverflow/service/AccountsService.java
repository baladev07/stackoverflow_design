package com.stackoverflow.service;

import com.stackoverflow.account_enums.AccountStatus;
import com.stackoverflow.dto.SignUpInfo;
import com.stackoverflow.models.Account;
import com.stackoverflow.repository.AccountsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AccountsService {

    @Autowired
    AccountsRepository accountsRepository;


    public void createAccount(SignUpInfo signUpInfo)
    {
        Account account = new Account();
        account.setAccountType(AccountStatus.Active.getCode());
        account.setName(signUpInfo.getName());
        account.setEmail(signUpInfo.getEmail());
        account.setStatus(signUpInfo.getStatus());
        account.setPhone(signUpInfo.getPhone());
        accountsRepository.save(account);
    }

   public Account getAccountByName(String name)
    {
       Account userAccountDetail = accountsRepository.findByName(name);
       return userAccountDetail;
    }






}
