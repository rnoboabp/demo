package com.bancopichincha.repository;

import com.bancopichincha.entity.Account;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class AccountRepository implements PanacheRepositoryBase<Account, Long> {

}
