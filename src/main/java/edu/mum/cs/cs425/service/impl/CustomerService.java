package edu.mum.cs.cs425.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.model.Customer;
import edu.mum.cs.cs425.repository.CustomerRepository;
import edu.mum.cs.cs425.service.ICustomerService;

@Service
public class CustomerService implements ICustomerService {
	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public void saveCustomer(Customer customer) {
		if(customer != null)
			customerRepository.save(customer);
	}

	@Override
	public Iterable<Customer> getCustomer() {
		return customerRepository.findAll(Sort.by(Direction.ASC, "lastName"));
	}

}
