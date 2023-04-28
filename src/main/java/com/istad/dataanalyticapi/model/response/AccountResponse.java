package com.istad.dataanalyticapi.model.response;

import com.istad.dataanalyticapi.model.AccountType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountResponse {
    private int id;
    private String accountName;
    private String accountNumber;
    private  String profile;
    private String phoneNumber;
    private int transferLimit;
    private AccountType accountType;
}
