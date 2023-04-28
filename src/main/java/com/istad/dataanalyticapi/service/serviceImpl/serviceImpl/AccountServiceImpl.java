package com.istad.dataanalyticapi.service.serviceImpl.serviceImpl;

import com.istad.dataanalyticapi.model.Account;
import com.istad.dataanalyticapi.repository.AccountRepository;
import com.istad.dataanalyticapi.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements AccountService {

    private  final AccountRepository accountRepository;
    AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    @Override
    public List<Account> getAllAccounts() {
        return null;
    }

    @Override
    public int createAccount(Account account) {
        return 0;
    }

    @Override
    public int updateAccount(Account account, int id) {
        return 0;
    }

    @Override
    public Account findAccountById(int id) {
        return accountRepository.findAccountById(id);
    }
}
