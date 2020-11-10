package com.bancopichincha.service;

import java.util.List;

import com.bancopichincha.entity.Account;
import com.bancopichincha.repository.AccountRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class AccountServiceImp implements IAccountService {

  @Inject
  AccountRepository accountRepository;

  @Override
  public List<Account> findAllAccount() {
    return accountRepository.findAll().list();
  }

  @Override
  public Account findAccountById(Long id) {
    return accountRepository.findById(id);
  }

  @Override
  public Account mergeAccount(Account account) {
    account.persist();
    return account;
  }
  
}
