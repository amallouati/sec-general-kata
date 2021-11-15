package com.kata.secgeneral.services;

import java.time.LocalDate;

public interface AccountService {
	
	
	 public void deposit(float amount,LocalDate dateOperation);
	 
	
	 public void withdrawal(float amount,LocalDate dateOperation);

}
