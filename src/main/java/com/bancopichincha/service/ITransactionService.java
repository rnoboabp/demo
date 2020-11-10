package com.bancopichincha.service;

import com.bancopichincha.entity.Transaction;

public interface ITransactionService {

  public Transaction findById(Long id);

  public Transaction save(Transaction transaction);


}
