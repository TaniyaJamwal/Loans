package com.bank.loans.loans.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.loans.loans.model.Loans;

@Repository
public interface LoansRepository extends CrudRepository<Loans,Long>{

	Loans findByCustomerid(int customerid); 
}
