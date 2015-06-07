package com.gherghelau.bankapp.root;

import com.gherghelau.bankapp.contentproviders.TestContentProvider;
import com.gherghelau.bankapp.models.Bank;
import com.google.gson.Gson;

public class Program {

	/**
	 * @param args
	 * @throws Exception 
	 */
	//{"customers":[{"firstName":"Andrei","lastName":"Gherghelau","accounts":[{"balance":200.0}]}]}
	//https://code.google.com/p/google-gson/downloads/detail?name=google-gson-2.2.4-release.zip&
	
	public static void main(String[] args) throws Exception {
		TestContentProvider tcp = new TestContentProvider();
		Bank bank = tcp.getTestBank();
		
		/*Gson ceva = new Gson();
		String result = ceva.toJson(bank);
		System.out.println(result);
		
		Bank deserializedObj = ceva.fromJson(result, Bank.class);*/	
		Bank bank2 = Bank.getInstance();
		
		System.out.println(BankPersister.saveBankData(bank, "bank.txt"));
		System.out.println(BankPersister.loadBankData(bank2, "bank.txt"));
		
		int x = 0;
	}

}
