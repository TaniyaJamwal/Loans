package com.bank.loans.loans.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter @Setter @ToString
public class Customer {
    
	@Id
	private int customerid;
	private String name;
	private String email;
	private String mobileNo;
	private String createDate;
}
