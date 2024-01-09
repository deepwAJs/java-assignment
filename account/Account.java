package com.account;

public class Account {
	private int acctId;
	private String acctType;
	private double acctBalance;

	public Account(int acctId, String acctType, double acctBalance) {
		this.acctId = acctId;
		this.acctType = acctType;
		this.acctBalance = acctBalance;
	}

	public void deposit(int amount) {
		acctBalance += amount;
		System.out.println(amount + " deposited successfully.");
	}

	public void withdraw(int amount) {
		if (amount <= acctBalance) {
			acctBalance -= amount;
			System.out.println(amount + " withdrawn successfully.");
		} else {
			System.out.println("Insufficient funds. Withdrawal failed.");
		}
	}

	public double getBalance() {
		return acctBalance;
	}

	public void display() {
		System.out.println("Account ID: " + acctId);
		System.out.println("Account Type: " + acctType);
		System.out.println("Account Balance: " + acctBalance);
	}
}
