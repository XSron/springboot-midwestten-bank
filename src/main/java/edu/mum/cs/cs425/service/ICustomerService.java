package edu.mum.cs.cs425.service;

import org.springframework.stereotype.Service;

import edu.mum.cs.cs425.model.Customer;

@Service
public interface ICustomerService {
	public void saveCustomer(Customer customer);
	public Iterable<Customer> getCustomer();
}
