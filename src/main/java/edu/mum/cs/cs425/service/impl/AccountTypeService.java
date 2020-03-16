package edu.mum.cs.cs425.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.model.AccountType;
import edu.mum.cs.cs425.repository.AccountTypeRepository;
import edu.mum.cs.cs425.service.IAccountTypeService;

@Service
public class AccountTypeService implements IAccountTypeService {
	@Autowired
	private AccountTypeRepository accountTypeRepository;
	@Override
	public Iterable<AccountType> getAccountType() {
		return accountTypeRepository.findAll();
	}
	@Override
	public void saveAccountType(AccountType account) {
		if(account != null)
			accountTypeRepository.save(account);
	}
}
