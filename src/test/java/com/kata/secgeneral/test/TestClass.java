package com.kata.secgeneral.test;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.kata.secgeneral.model.Account;
import com.kata.secgeneral.services.AccountService;
import com.kata.secgeneral.services.AccountServiceImpl;
import com.kata.secgeneral.services.PrintAccountImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestClass {
	
	private Account account;
	private AccountService accountService;
	LocalDate depositDate = LocalDate.now();
	private static final String printedLine="24/10/2021   1000,00    1100,00";
	
	@Before
	public void initialise() {
		account = new Account(100);
		accountService=new AccountServiceImpl(account);
		
	}
	
	
	@Test public void
	accountDeposite() {
		accountService.deposit(1000, depositDate);
		assertTrue(account.getBalance()==1100);
	}
	
	@Test public void
	accountWithdraw() {
		accountService.withdrawal(1000, depositDate);
		assertTrue(account.getBalance()==-900);
	}
	
	@Test public void
	testNumberOperations() {
		accountService.deposit(1000, depositDate);
		accountService.withdrawal(1000, depositDate);
		assertTrue(account.getListTransactions().size()==2);
	}
	
	@Test public void
	testAffichage() {
		LocalDate testDate = LocalDate.of(2021, 10, 24); 
		accountService.deposit(1000, testDate);
		PrintAccountImpl affichage=new PrintAccountImpl(account.getListTransactions().get(0));
		assertTrue(affichage.printTransaction().equals(printedLine));
	}

}
