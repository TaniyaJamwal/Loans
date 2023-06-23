package com.bank.loans.loans.controller;

import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bank.loans.loans.model.Customer;
import com.bank.loans.loans.model.Loans;
import com.bank.loans.loans.repository.LoansRepository;


@RestController
public class LoansController {
	
	@Autowired
	private LoansRepository loanrepo;
	
	@PostMapping("/myloans")
	public Loans getLoanDetails(@RequestBody Customer customer)
	{
		Loans loan= loanrepo.findByCustomerid(customer.getCustomerid());
		if(loan!=null)
			return loan;
		else
			return null;
		
	}
	

}
