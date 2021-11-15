package com.kata.secgeneral.model;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter @NoArgsConstructor 
public class Account {
	
	private float balance;

	private List<Transaction> listTransactions = new ArrayList<Transaction>();
	 
	 public Account(float b){
		 balance=b;
	    
	 }
	 
	  public String toString(){
	     return ( "balance="+balance+", le \"+ dateOperation + '");
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	

	


}
