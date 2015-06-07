package com.gherghelau.bankapp.root;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

import com.google.gson.Gson;
import com.gherghelau.bankapp.models.Bank;

public class BankPersister {

	public static boolean saveBankData(Bank bank, String fileName) {
		try {
			Gson gson = new Gson();

			PrintWriter writer = new PrintWriter(fileName, "UTF-8");

			writer.println(gson.toJson(bank));
			writer.close();

			return true;
		} catch (Exception ex) {

			return false;
		}
	}

	public static boolean loadBankData(Bank bank, String fileName) {
		try {
			Gson gson = new Gson();
			Scanner scanner = new Scanner(new File(fileName));
			String content = "";
			while (scanner.hasNext()) {
				content += scanner.nextLine();
			}
			bank = gson.fromJson(content, Bank.class);

			return true;
		} catch (Exception ex) {

			return false;
		}
	}
}
