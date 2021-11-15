package com.kata.secgeneral.services;

import com.kata.secgeneral.model.Transaction;

public class PrintAccountImpl implements PrintAccount{

	
	private final Transaction transaction;
	
	public PrintAccountImpl(Transaction transaction) {
		super();
		this.transaction = transaction;
	}
	
	/**
	 * print transaction date
	 * @return
	 */
	private String printDateTransaction() {
		
		return formatters.format(transaction.getDateTransaction());
	}
	
	/**
	 * print transaction amont
	 * @return
	 */
	private  String printBalance() {
		return decimalFormat.format(transaction.getAmount());
	}

	/**
	 * print balance transaction
	 * @return
	 */
	private String printBalanceTransaction() {
		return decimalFormat.format(transaction.getBalanceTransaction());
	}
	
	public String printTransaction() {
		return String.format("%s   %s    %s", printDateTransaction(),printBalance(),printBalanceTransaction());
	}


	
	



}
