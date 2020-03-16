package edu.mum.cs.cs425.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.cs.cs425.model.Customer;
import edu.mum.cs.cs425.service.impl.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	@GetMapping("/customer/customerlist")
	public ModelAndView getCustomerList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("customers", customerService.getCustomer());
		modelAndView.setViewName("customer/customerlist");
		return modelAndView;
	}
	@GetMapping("/customer/addcustomer")
	public ModelAndView addCustomer() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("customer", new Customer());
		modelAndView.setViewName("customer/addcustomer");
		return modelAndView;
	}
	@PostMapping("/customer/addcustomer")
	public String postCustomer(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
		if(result.hasErrors()) 
			return "customer/addcustomer";
		customerService.saveCustomer(customer);
		return "redirect:/customer/customerlist";
	}
}
