package com.bankapp.models;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private List<Customer> customers;
	private static Bank instance;

	private Bank() {
		customers = new ArrayList<Customer>();
	}

	public static Bank getInstance() {
		if (instance == null) {
			instance = new Bank();
		}
		return instance;
	}

	public void addCustomer(String firstName, String lastName) throws Exception {
		if (firstName == null || lastName == null) {
			throw new Exception("Param null passed!");
		}
		Customer customer = new Customer(firstName, lastName);
		customers.add(customer);
	}

	public int getNumberOfCustomers() {
		return customers.size();
	}

	public Customer getCustomer(int index) throws Exception {
		if (index < 0 || index > customers.size()) {
			throw new Exception("Cannot get element at this index");
		}
		return customers.get(index);
	}

}
