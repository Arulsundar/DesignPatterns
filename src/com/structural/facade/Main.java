package com.structural.facade;

public class Main {
	
	public static void main(String[] args)
	{
		BankAccountFacade myaccount=new BankAccountFacade(12345678,1234);
		
		myaccount.withdrawCash(5000.00);
		
		myaccount.deposit(10000);
		
		myaccount.withdrawCash(5000.00);
	}

}
