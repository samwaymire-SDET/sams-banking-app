package com.example.bank;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BankController {

        @GetMapping("/hello")
        public String hello() {
            return "Hello, bank!";
        }
    }

