package edu.mum.cs.cs425.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.model.AccountType;

@Repository
public interface AccountTypeRepository extends CrudRepository<AccountType, Long>{

}
