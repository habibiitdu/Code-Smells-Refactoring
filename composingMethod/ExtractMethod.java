package com.csr.composingMethod;

public class ExtractMethod {
	/*--------------------------------------------------
	 * 
	 * 
	void printOwing(String name) {
		  printBanner();

		  //print details
		  System.out.println("name: " + name);
		  System.out.println("amount: " + getAmount());
		}
	
	void printBanner(){
		System.out.println("Printing Banner");
	}
	
	String getAmount(){
		return 100.1; 
	}
	* Smell: Complex lines to understand and extract the meaning
	* 
	*The Problem of the smells is: The more lines in a method, the more complex the code is. 
	*                              Then It will be hard to figure out the exact goal of the method
	*								--------------------------------------------------*/
	
	
	void bannerPreparation(String name){
		printBanner();
		printDetails(name, getAmount()); 
	}
	
	void printDetails(String name, double outstanding){
		System.out.println("name: " + name);
		System.out.println("amount: " + outstanding);
	}
	
	void printBanner(){
		System.out.println("Printing Banner");
	}
	
	double getAmount(){
		return 100.1; 
	}
}
