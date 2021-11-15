package com.kata.secgeneral.model;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import com.kata.secgeneral.services.AccountService;
import com.kata.secgeneral.services.AccountServiceImpl;
import com.kata.secgeneral.services.PrintAccount;
import com.kata.secgeneral.services.PrintAccountImpl;
public class Test {
	public static final String STATEMENT_HEADER = "date       | Amount    | balance";

	public static void main(String[] args) {
		Account account = new Account (0);
		
		LocalDate depositDate = LocalDate.now();
        LocalDate testDate = LocalDate.of(2021, 10, 25); 
		LocalDate testDate2 = LocalDate.of(2021, 10, 26);
		
		AccountService accountService=new AccountServiceImpl(account);
		
		accountService.deposit(5000,depositDate);
		accountService.withdrawal(1000,depositDate);
		accountService.deposit(4000,testDate);
		accountService.withdrawal(1500,testDate);
		accountService.deposit(2000,testDate2);
		accountService.withdrawal(500,testDate2);
        
        PrintAccount.printHeader();
        
        List<Transaction> listTransaction2=account.getListTransactions().stream().filter(op->op.getDateTransaction().isAfter(testDate)).collect(Collectors.toList());
        
        listTransaction2.stream().map(transaction->{
        	PrintAccountImpl print=new PrintAccountImpl(transaction);
        	return print.printTransaction();
        }).forEach(System.out::println);
         System.out.println("***************************************");
        account.getListTransactions().stream().map(operation->{
        	PrintAccountImpl print=new PrintAccountImpl(operation);
        	return print.printTransaction();
        }).forEach(System.out::println);
        
        

	}

	

}
