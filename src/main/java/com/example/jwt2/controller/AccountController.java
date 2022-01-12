package com.example.jwt2.controller;

import com.example.jwt2.mapper.AccountMapper;
import com.example.jwt2.model.Account;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountMapper accountMapper;
    @GetMapping("/findByUserName")
    public List<Account> findByUserName(@RequestParam(name = "search") String userName) {
        List<Account> byUserName = accountMapper.findByUserName(userName);
        return byUserName;
    }

}
