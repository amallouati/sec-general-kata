package com.kata.secgeneral.services;

import java.time.LocalDate;

import com.kata.secgeneral.model.Account;
import com.kata.secgeneral.model.Transaction;

public class AccountServiceImpl implements AccountService {

	private final Account account;

	public AccountServiceImpl(Account account) {
		this.account = account;
	}

	@Override
	public void deposit(float amount, LocalDate dateOperation) {
		account.setBalance(account.getBalance() + amount);
		Transaction o1 = new Transaction(amount, dateOperation, account.getBalance());
		account.getListTransactions().add(o1);

	}

	@Override
	public void withdrawal(float amount, LocalDate dateOperation) {
		account.setBalance(account.getBalance() - amount);
		Transaction o1 = new Transaction(-amount, dateOperation, account.getBalance());
		account.getListTransactions().add(o1);

	}

}
