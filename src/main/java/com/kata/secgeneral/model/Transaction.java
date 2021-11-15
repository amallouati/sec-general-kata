package com.kata.secgeneral.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Transaction {
	
	private LocalDate dateTransaction;
	private double amount;
	private double balanceTransaction;
	
	 public Transaction(double amount, LocalDate dateTransaction, double balanceTransaction) {
	        this.amount = amount;
	        this.dateTransaction = dateTransaction;
	        this .balanceTransaction=balanceTransaction;
	        
	    }
	
}
