package com.istad.dataanalyticapi.controller;

import com.istad.dataanalyticapi.mapper.AutoAccountMapper;
import com.istad.dataanalyticapi.model.Account;
import com.istad.dataanalyticapi.model.response.AccountResponse;
import com.istad.dataanalyticapi.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    final private AutoAccountMapper autoAccountMapper;
//    account
    final private AccountService accountService;
    AccountController(AccountService accountService,AutoAccountMapper autoAccountMapper){
        this.accountService = accountService;
        this.autoAccountMapper = autoAccountMapper;
    }
    @GetMapping("/allaccounts")
    public ResponseEntity<?> getAllAccount(){
        try{
            List<Account> allAccount = accountService.getAllAccounts();
            List<AccountResponse> accountResponses = autoAccountMapper.mapToAccountResponse(allAccount);
//            List<AccountResponse>
            HashMap<String, Object> response = new HashMap<>();
            response.put("payload", accountResponses);
            response.put("message", "Successfully retrieved all account info");
            response.put("status", HttpStatus.OK);
            List<Account> allAccounts = accountService.getAllAccounts();
            return ResponseEntity.ok().body(response);
        }catch (Exception ex){
            System.out.println("something wrong: " + ex.getMessage());
            return ResponseEntity.ok().body("Failed to retrieved the account");
        }
    }
}
