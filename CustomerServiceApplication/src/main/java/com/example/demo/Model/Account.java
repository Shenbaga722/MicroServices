package com.example.demo.Model;

import org.springframework.lang.NonNull;

public class Account {
    private String AccountType;
    @NonNull
    private String IFSCCode;
    private String branch;

    public Account( String accountType, String IFSCCode, String branch) {
        this.AccountType = accountType;
        this.IFSCCode = IFSCCode;
        this.branch=branch;
    }
}
