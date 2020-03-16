package edu.mum.cs.cs425.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "accounts")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountId;
	@Column(nullable = false, unique = true) @NotBlank
	private String accountNumber;
	@Column(nullable = false) @NotNull
	private double balance;
	@OneToOne
	@JoinColumn(name = "customer_id")
	private Customer customer;
	@OneToOne
	@JoinColumn(name = "account_type_id")
	private AccountType accountType;
	public Account() {};
	public Account(String accountNumber, double balance, Customer customer, AccountType accounttype) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customer = customer;
		this.accountType = accounttype;
	}
	public long getAccountId() {
		return accountId;
	}
	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public AccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}
}
