package com.behavioural.chainofResponsibility;

public class Addition implements Chain{
     
	private Chain nextChain;
	@Override
	public void nextChain(Chain nextChain) {
		
		this.nextChain=nextChain;
		
	}

	@Override
	public void calculate(Number request) {
	
	System.out.println("Request Checks for Addition");
	
	if(request.getCalculationWanted() == "add")
       
	   System.out.println(request.getNumber1()+"+"+request.getNumber2()+"="+(request.getNumber1()
	                                                                       +request.getNumber2()));
	else
	{   
		System.out.println("Request passed to nextChain from Addition");
		nextChain.calculate(request);
	}
	}

}
