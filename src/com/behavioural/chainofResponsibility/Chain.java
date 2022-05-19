package com.behavioural.chainofResponsibility;

public interface Chain {
	
	public void nextChain(Chain nextChain);
	
	public void calculate(Number request);

}
