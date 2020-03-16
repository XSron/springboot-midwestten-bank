package edu.mum.cs.cs425.service;

import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.model.Account;

@Service
public interface IAccountService {
	public void saveAccount(Account account);
	public Iterable<Account> getAccount();
	public double getNetLiquidity();
}
