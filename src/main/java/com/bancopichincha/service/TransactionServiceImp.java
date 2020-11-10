package com.bancopichincha.service;

import com.bancopichincha.entity.Transaction;
import com.bancopichincha.repository.TransactionRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class TransactionServiceImp implements ITransactionService {

  @Inject
  TransactionRepository transactionRepository;

  @Override
  public Transaction findById(Long id) {
    return transactionRepository.findById(id);
  }

  @Override
  public Transaction save(Transaction transaction) {
    transaction.persist();
    return transaction;
  }

}
