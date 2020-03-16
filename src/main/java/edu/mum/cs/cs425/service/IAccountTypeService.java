package edu.mum.cs.cs425.service;

import edu.mum.cs.cs425.model.AccountType;

public interface IAccountTypeService {
	public void saveAccountType(AccountType account);
	public Iterable<AccountType> getAccountType();
}
