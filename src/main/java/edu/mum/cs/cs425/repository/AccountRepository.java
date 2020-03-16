package edu.mum.cs.cs425.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import edu.mum.cs.cs425.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	@Query(value = "SELECT COALESCE((SELECT SUM(balance) FROM accounts where account_type_id IN(1,3)), 0.0) "
				 + "- COALESCE((SELECT SUM(balance) FROM accounts where account_type_id = 2), 0.0)", nativeQuery = true)
	public double getNetLiquidity();
}
