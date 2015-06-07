package com.bankapp.models;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String firstName;
	private String lastName;
	private List<Account> accounts;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Customer(String firstName, String lastName) {
		accounts = new ArrayList<Account>();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getNumberOfAccounts() {
		return accounts.size();
	}

	public Account getAccount(int index) throws Exception {
		if (index < 0 || index > this.getNumberOfAccounts()) {
			throw new Exception("Out of bounds!");
		}
		return accounts.get(index);
	}

	public void addAccount(Account account) throws Exception {
		if (account == null) {
			throw new Exception("Null argument!");
		}
		accounts.add(account);
	}

}
