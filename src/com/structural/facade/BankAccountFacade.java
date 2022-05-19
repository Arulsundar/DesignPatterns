package com.structural.facade;

public class BankAccountFacade {
	
	private int accountnumber;
	
	private int securityCode;
	
	public int getSecurityCode() {
		return securityCode;
	}

	public int getAccountnumber() {
		return accountnumber;
	}


	AccountNumberCheck accNumberCheck;
	
	SecurityCodeCheck secCodeCheck;
	
	FundsCheck fundsChech;

	public BankAccountFacade(int accountnumber, int securityCode) {
		
		this.accountnumber = accountnumber;
		this.securityCode = securityCode;
	    accNumberCheck = new AccountNumberCheck();
		secCodeCheck = new SecurityCodeCheck();
		fundsChech = new FundsCheck() ;
	}
	
	public void withdrawCash(double cashToGet)
	{
		if(accNumberCheck.accountActive(getAccountnumber()) && secCodeCheck.isValidCode(getSecurityCode()) && fundsChech.haveEnoughMoney(cashToGet))
		{
			System.out.println("Transaction Complete");
		}
		else
		{
			System.out.println("Transaction Failed");
		}
	}
	
	public void deposit(double cashToGet)
	{
		if(accNumberCheck.accountActive(getAccountnumber()) && secCodeCheck.isValidCode(getSecurityCode()))
		{
			fundsChech.makeDeposit(cashToGet);
			System.out.println("Transaction Complete");
		}
		else
		{
			System.out.println("Transaction Failed");
		}
	}

}
