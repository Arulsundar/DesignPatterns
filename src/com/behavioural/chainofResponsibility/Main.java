package com.behavioural.chainofResponsibility;

public class Main {
	
	public static void main(String[] args)
	{
			Chain addChain=new Addition();
			Chain subChain=new Subtraction();
			Chain mulChain=new Multiplication();
			Chain divChain=new Division();
			
			addChain.nextChain(mulChain);
			mulChain.nextChain(subChain);
			subChain.nextChain(divChain); 
			
			Number request=new Number(4,2,"div");
			
			addChain.calculate(request);
					
	}

}
