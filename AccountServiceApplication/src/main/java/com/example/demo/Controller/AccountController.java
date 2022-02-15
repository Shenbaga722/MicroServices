package com.example.demo.Controller;


import com.example.demo.Model.Account;
import com.example.demo.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    AccountService accountService;

    @GetMapping("/getAccounts")
    public List<Account> getAccounts(){
        return accountService.getAccounts();
    }

    @PostMapping("/createAccounts")
    public void createAccounts(@RequestBody Account account){
        Account account1 = new Account();
        accountService.createAccounts(account);
    }
}