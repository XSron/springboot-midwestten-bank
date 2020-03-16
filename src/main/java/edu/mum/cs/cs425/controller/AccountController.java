package edu.mum.cs.cs425.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import edu.mum.cs.cs425.model.Account;
import edu.mum.cs.cs425.service.impl.AccountService;
import edu.mum.cs.cs425.service.impl.AccountTypeService;
import edu.mum.cs.cs425.service.impl.CustomerService;

@Controller
public class AccountController {
	@Autowired
	private AccountService accountService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private AccountTypeService accountTypeService;
	@GetMapping("/account/accountlist")
	public ModelAndView getAccountList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("accounts", accountService.getAccount());
		modelAndView.addObject("liquidity", accountService.getNetLiquidity());
		modelAndView.setViewName("account/accountlist");
		return modelAndView;
	}
	@GetMapping("/account/addaccount")
	public ModelAndView addAccount() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("account", new Account());
		modelAndView.addObject("customers", customerService.getCustomer());
		modelAndView.addObject("accounttypes", accountTypeService.getAccountType());
		modelAndView.setViewName("account/addaccount");
		return modelAndView;
	}
	@PostMapping("/account/addaccount")
	public String postAccount(@Valid @ModelAttribute("account") Account account, BindingResult result, Model model) {
		if(result.hasErrors())  {
			model.addAttribute("customers", customerService.getCustomer());
			model.addAttribute("accounttypes", accountTypeService.getAccountType());
			return "account/addaccount";	
		}
		accountService.saveAccount(account);
		return "redirect:/account/accountlist";
	}
}
