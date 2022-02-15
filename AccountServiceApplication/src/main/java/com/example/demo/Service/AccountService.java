package com.example.demo.Service;
import com.example.demo.Model.Account;
import com.example.demo.Repo.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    AccountRepo accountRepo;

    public List<Account> getAccounts(){
        return (List<Account>) accountRepo.findAll();
    }
    public void createAccounts(Account account){
        accountRepo.save(account);
    }
}
