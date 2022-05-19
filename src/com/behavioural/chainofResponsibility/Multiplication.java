package com.behavioural.chainofResponsibility;

public class Multiplication implements Chain{
	
	private Chain nextChain;
	@Override
	public void nextChain(Chain nextChain) {
		
		this.nextChain=nextChain;
		
	}

	@Override
	public void calculate(Number request) {
	
	System.out.println("Request Checks for Multiplication");
	
	if(request.getCalculationWanted() == "mul")
       
	   System.out.println(request.getNumber1()+"*"+request.getNumber2()+"="+
	                                         (request.getNumber1()* request.getNumber2()));
	else
	{   
		System.out.println("Request passed to nextChain from Multiplication");
		nextChain.calculate(request);
	}
	}

}
