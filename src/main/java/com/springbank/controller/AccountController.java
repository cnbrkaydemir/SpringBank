package com.springbank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping(value = "myAccount")
    public String accountDetails(){
        return "Here are the account details from DB";
    }

}
