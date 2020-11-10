package com.bancopichincha.service;

import com.bancopichincha.entity.Account;
import java.util.List;

public interface IAccountService {

  public List<Account> findAllAccount();
  public Account findAccountById(Long id);
  public Account mergeAccount(Account account);

}
