package com.csr.composingMethod;

public class ExtractVariable {
	/*
	 * void renderBanner() {
 			if ((platform.toUpperCase().indexOf("MAC") > -1) &&
       			(browser.toUpperCase().indexOf("IE") > -1) && 
       			wasInitialized() && resize > 0 ){
    			// do something
  				}
			}
	 * 
	 * The smell is: Conditional parameter is to long and ambiguous. 
	 * Need to clear the conditions and separate this by variable/methods
	 * 
	 * Lets try the solution: 
	 * 
	 */
	
	/*After Refactored: 
	 * 
	 * void renderBanner() {
		final boolean isMac= platform.toUpperCase().indexOf("MAC") > -1; 
		final boolean isIE = browser.toUpperCase().indexOf("IE") > -1; 
		final boolean isResized = resize > 0
		
			if (isMac && isIE && wasInitialized() && isResized ){
			// do something
				}
		}*/

}
