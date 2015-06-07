package com.gherghelau.bankapp.models;

public class CheckingAccount extends Account {

	private double overdraftLimit = 0.0;

	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance, double overdraft) {
		super(balance);
		overdraftLimit = overdraft;
	}

	@Override
	public boolean withdraw(double amount) {
		if (balance <= 0) {
			if (amount <= overdraftLimit) {
				balance -= amount;
				return true;
			}
			return false;
		} else {
			if (amount <= balance + overdraftLimit) {
				balance -= amount;
				return true;
			}
			return false;
		}
	}

}
