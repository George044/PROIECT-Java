package com.bankapp.models;

public class Account {
	protected double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	@Override
	public String toString() {
		return String.format("%lf", balance);
	}

	public boolean withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			return true;
		}
		return false;
	}

	public String getDescription() {
		return String.format("Deposit account : %lf", balance);
	}
}
