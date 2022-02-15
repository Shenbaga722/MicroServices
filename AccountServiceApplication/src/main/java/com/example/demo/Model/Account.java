package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="accounts")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int AccountId;
    @NonNull
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
