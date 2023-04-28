package com.istad.dataanalyticapi.repository;


import com.istad.dataanalyticapi.model.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Mapper
@RequestMapping("/account")
public interface AccountRepository {
    @Results({
            @Result(property = "password",column = "password"),
            @Result(property = "accountName", column = "account_name"),
            @Result(property = "accountNumber", column = "account_no"),
            @Result(property = "transferLimit", column = "transfer_limit"),
            @Result(column = "account_type", property = "accountType", one = @One(select = "getAccountTypeByTd"))
    })
    @Select("select * from account_db")
    List<Account> getAllAccounts();
    int createAccount(Account account);
    int updateAccount(Account account, int id);
    Account findAccountById(int id);
}
