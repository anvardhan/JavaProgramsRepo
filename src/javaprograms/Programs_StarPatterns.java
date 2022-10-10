package javaprograms;

import org.testng.annotations.Test;

public class Programs_StarPatterns {
	
	@Test(enabled=false)
	public void pattern1() {
		
	/*  *
		**
		***
		****
		*****
	*/
		
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
	}
	
	@Test(enabled=false)
	public void pattern2() {
		
	/*  *****
		****
		***
		**
		*
	*/
		
		for(int i = 0; i <= 4; i++) {
			for(int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
	}
	
	@Test(enabled=false)
	public void pattern3() {
		
	/*  
	    *
	    **
	    ***
	    ****	  
	    *****
		****
		***
		**
		*
	*/
		
		
		for(int i = 0; i <= 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 0; i <= 3; i++) {
			for(int j = 3; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}		
		
	}

	@Test(enabled=false)
	public void pattern4() {
		
	/*  
	    	*
	       **
	      ***
	     ****	  
	    *****
	*/
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 4; j >= i ; j--) {
				
				System.out.print(" ");
				
			}
			
			for(int k = 1; k <= i ; k++) {
				
				System.out.print("*");
				
			}			
			System.out.println();
		}		
		
	}
	
	@Test(enabled=false)
	public void pattern5() {
		
	/*  Pyramid
	    	*
	       * *
	      * * *
	     * * * *	  
	    * * * * *
	*/
		
		//Same logic as in pattern 4 - Add just space between stars
		
		for(int i = 1; i <= 5; i++) {
			
			for(int j = 4; j >= i ; j--) {
				
				System.out.print(" ");
				
			}
			
			for(int k = 1; k <= i ; k++) {
				
				System.out.print("*" + " ");
				
			}			
			System.out.println();
		}	
		
	}
		
		
}
