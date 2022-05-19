package com.behavioural.chainofResponsibility;

public class Division implements Chain {
	
	private Chain nextChain;
	@Override
	public void nextChain(Chain nextChain) {
		
		this.nextChain=nextChain;
		
	}

	@Override
	public void calculate(Number request) {
	
	System.out.println("Request Checks for Division");
	
	if(request.getCalculationWanted() == "div")
       
	   System.out.println(request.getNumber1()+"/"+request.getNumber2()+"="+
	                                         (request.getNumber1()/ request.getNumber2()));
	else
	{   
		System.out.println("Only works for ADD, SUBTRACT , MULTIPLY , DIVISION");
	}
	}

}
