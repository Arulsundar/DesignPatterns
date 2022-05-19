package com.behavioural.chainofResponsibility;

public class Subtraction implements Chain{
	
	private Chain nextChain;
	@Override
	public void nextChain(Chain nextChain) {
		
		this.nextChain=nextChain;
		
	}

	@Override
	public void calculate(Number request) {
	
	System.out.println("Request Checks for Subtraction");
	
	if(request.getCalculationWanted() == "sub")
       
	   System.out.println(request.getNumber1()+"-"+request.getNumber2()+"="+
	                                         (request.getNumber1()- request.getNumber2()));
	else
	{   
		System.out.println("Request passed to nextChain from Subtraction");
		nextChain.calculate(request);
	}
	}

}
