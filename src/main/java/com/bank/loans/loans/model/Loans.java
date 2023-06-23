package com.bank.loans.loans.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Loans {
	
	private int customerid;
	@Id
	private int loanno;
	private String name;
	private String loantype;
	
	
	

}
