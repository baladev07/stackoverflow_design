package com.stackoverflow.config;


import com.stackoverflow.models.Account;
import com.stackoverflow.service.AccountsService;
import com.stackoverflow.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.http.HttpServletRequest;

@Configuration
public class AppConfig {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    AccountsService accountService;

    @Bean
    @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS )
    public Account account()
    {
        String username = request.getParameter("username");
         return accountService.getAccountByName(username);
    }
}


