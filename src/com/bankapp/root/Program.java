package com.bankapp.root;

import com.bankapp.contentproviders.TestContentProvider;
import com.bankapp.models.Bank;
import com.google.gson.Gson;

public class Program {

	public static void main(String[] args) throws Exception {
		TestContentProvider tcp = new TestContentProvider();
		Bank bank = tcp.getTestBank();
		
		Bank bank2 = Bank.getInstance();
		
		System.out.println(BankPersister.saveBankData(bank, "bank.txt"));
		System.out.println(BankPersister.loadBankData(bank2, "bank.txt"));
		
		int x = 0;
	}

}
