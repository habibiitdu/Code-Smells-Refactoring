package com.csr.composingMethod;

public class InlineMethod {
	/*
	 class PizzaDelivery {
		  //...
		  int getRating() {
		    return moreThanFiveLateDeliveries() ? 2 : 1;
		  }
		  boolean moreThanFiveLateDeliveries() {
		    return numberOfLateDeliveries > 5;
		  }
		}
	 * 
	 * The Smell is: The method is created for nothing good. The condition 
	 *                Can be set within the lien itself 
	 */
	
	/*Caution: If the method is a part of subclasses then this way is harmful 
	 * or may create more complexities 
	 * 
	 * The Refactored code is given bellow: 
	 */
	
	class PizzaDelivery {
		  //...
		int numberOfLateDeliveries = 4; // added only to understand the code more clearly. 
		  int getRating() {
		    return numberOfLateDeliveries > 5 ? 2 : 1;
		  }
		}
	
}
