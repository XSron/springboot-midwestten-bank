package edu.mum.cs.cs425.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "accounttypes")
public class AccountType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountTypeId;
	@Column(nullable = false) @NotBlank
	private String accountTypeName;
	public AccountType() {}
	public AccountType(String accountTypeName) {
		super();
		this.accountTypeName = accountTypeName;
	}
	public long getAccountTypeId() {
		return accountTypeId;
	}
	public void setAccountTypeId(long accountTypeId) {
		this.accountTypeId = accountTypeId;
	}
	public String getAccountTypeName() {
		return accountTypeName;
	}
	public void setAccountTypeName(String accountTypeName) {
		this.accountTypeName = accountTypeName;
	}
}
