package com.bankapp.contentproviders;

import com.bankapp.models.*;

public class TestContentProvider {

	public Bank getTestBank() throws Exception {
		Bank bank = Bank.getInstance();
		bank.addCustomer("Cipri", "Ceve");
		bank.getCustomer(0).addAccount(new Account(200));

		return bank;
	}

}
