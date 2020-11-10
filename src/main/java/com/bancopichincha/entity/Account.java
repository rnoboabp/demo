package com.bancopichincha.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "account")
public class Account extends PanacheEntityBase {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id_account")
  private Long idAccount;

  @Column(name = "total_amount")
  private Double totalAmount;

  @Column(name = "id_customer")
  private Long idCustomer;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_customer", insertable = false, updatable = false)
  @Fetch(FetchMode.JOIN)
  private Customer customer;


  public Long getIdAccount() {
    return idAccount;
  }

  public void setIdAccount(Long idAccount) {
    this.idAccount = idAccount;
  }

  public Double getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Double totalAmount) {
    this.totalAmount = totalAmount;
  }

  public Long getIdCustomer() {
    return idCustomer;
  }

  public void setIdCustomer(Long idCustomer) {
    this.idCustomer = idCustomer;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }
}
