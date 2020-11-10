package com.bancopichincha.repository;

import com.bancopichincha.entity.Transaction;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TransactionRepository implements PanacheRepositoryBase<Transaction, Long> {

}
