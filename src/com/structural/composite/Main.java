package com.structural.composite;

public class Main {
	
	public static void main(String[] args)
	{
		Employee emp1= new Cashier(2,"shyaam",50000); 
		Employee emp2= new Cashier(3,"Harish",60000); 
		Employee emp3= new Accountant(4,"SSS",50000); 
		
		Employee manager=new BankManager(1,"sundar",1000000);
		
		manager.add(emp1);
		manager.add(emp2);
		manager.add(emp3);
		
		manager.print();
	}
	
	
	

}
