package com.example.bank;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/accounts")

public class AccountController {

    private final List<Account> accounts = new ArrayList<>();
    private long nextId = 1;

    @PostMapping
    public Account create(@RequestBody Account account){
        account.setId(nextId++);
        accounts.add(account);
        return account;
    }

    @GetMapping
    public List<Account> list(){
        return accounts;
    }
}
