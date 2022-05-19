package com.structural.facade;

public class FundsCheck {
	
	private double cash = 1000 ;
	
	public double getCash()
	{
		return cash;
	}
    
	public void decreaseCashInAmount(double cashWithdrawn)
	{
		cash-=cashWithdrawn;
	}
	
	public void increaseCashInAmount(double cashWithdrawn)
	{
		cash+=cashWithdrawn;
	}
	
	public boolean haveEnoughMoney(double cashWithdrawn)
	{
		if(cashWithdrawn >getCash())
		{
			System.out.println("Not Enough Balance");
			System.out.println("Current Balance: "+ getCash());
			return false;
		}
		
		else
		{
			decreaseCashInAmount(cashWithdrawn);
			System.out.println("Withdrawal Complete!! Current Balance =" +getCash());
			
			return true;
		}
	}
	
	public void makeDeposit(double cashWithdrawn)
	{
		increaseCashInAmount(cashWithdrawn);
		System.out.println("Deposit Complete!! Current Balance =" +getCash());
		
	}
	
}
