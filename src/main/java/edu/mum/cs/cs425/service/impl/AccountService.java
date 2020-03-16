package edu.mum.cs.cs425.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.model.Account;
import edu.mum.cs.cs425.repository.AccountRepository;
import edu.mum.cs.cs425.service.IAccountService;

@Service
public class AccountService implements IAccountService {
	@Autowired
	private AccountRepository accountRepository;
	@Override
	public void saveAccount(Account account) {
		if(account != null)
			accountRepository.save(account);
	}

	@Override
	public Iterable<Account> getAccount() {
		return accountRepository.findAll(Sort.by(Direction.ASC, "accountNumber"));
	}

	@Override
	public double getNetLiquidity() {
		return accountRepository.getNetLiquidity();
	}

}
