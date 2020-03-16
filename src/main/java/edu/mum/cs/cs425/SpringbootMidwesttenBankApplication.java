package edu.mum.cs.cs425;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import edu.mum.cs.cs425.model.AccountType;
//import edu.mum.cs.cs425.model.Customer;
//import edu.mum.cs.cs425.service.impl.AccountTypeService;

@SpringBootApplication
public class SpringbootMidwesttenBankApplication implements CommandLineRunner{
	/*@Autowired
	private AccountTypeService accountTypeService;*/
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMidwesttenBankApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		/*accountTypeService.saveAccountType(new AccountType("SAVING"));
		accountTypeService.saveAccountType(new AccountType("LOAN"));
		accountTypeService.saveAccountType(new AccountType("CHECKING"));*/
	}

}
