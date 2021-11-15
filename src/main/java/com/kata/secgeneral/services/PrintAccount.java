package com.kata.secgeneral.services;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public interface PrintAccount {
	
	
	String DATE_OPERATION_FORMAT = "dd/MM/yyyy";
 	DateTimeFormatter formatters = DateTimeFormatter.ofPattern(DATE_OPERATION_FORMAT);
 	DecimalFormat decimalFormat = new DecimalFormat("#.00");
 	String STATEMENT_HEADER = "Date       | Amount    | balance";
 	
 	String printTransaction();
 	static void printHeader() {
 		System.out.println(STATEMENT_HEADER);
 	}

}
