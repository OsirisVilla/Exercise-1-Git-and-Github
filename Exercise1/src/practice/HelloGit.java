package practice;

import java.util.Arrays;

public class HelloGit {
	
	// Comparison between 2 words
	public String compareTwoStrings(String word1, String word2) {

		try {
			if (word1.equals(word2)) {
				return "These 2 words are equal";
			} else {
				return "These 2 words are not equal";
			}
		} catch (NullPointerException ex) {
			return "You can't compare null objects";
		}

	}

	// Verify the biggest number in a list
	public boolean sortArray(int a[]) {

		// Find largest number in array
		int temp;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) { // > for Ascending order

					temp = a[j + 1];

					a[j + 1] = a[j];

					a[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(a)); // print sorted list

		// Find max value
		int max = a[0];

		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {

				max = a[i];
			}
		}

		System.out.println(max); // print max value

		// Compare largest number with max value
		if (a[a.length - 1] == max) {
			return true;
		}
		return false;
	}
	
	// Sort a list by Ascending and Descending order
	public void sortString(String[] c) {
		
		String temp;
		
		for(int i = 0; i < c.length - 1; i++) {
	    	  
	         for (int j = i + 1; j < c.length; j++) {
	        	 
	        	 /* < 0 then String calling the method is 
	        	   lexicographically first
	        	   
	        	   == 0 then the two strings are 
	        	   lexicographically equivalent
	        	   
	        	 > 0 then the parameter passed to the 
	        	   compareTo method is lexicographically first.*/
	        	 
	            if(c[i].compareTo(c[j]) > 0) { // > for Ascending order
	            	
	               temp = c[i];
	               
	               c[i] = c[j];
	               
	               c[j] = temp;
	            }
	         }
	      }
		
	      System.out.println(Arrays.toString(c));
	      
	      for(int i = 0; i < c.length - 1; i++) {
	    	  
		         for (int j = i + 1; j < c.length; j++) { // < for Descending order
		        	 
		            if(c[i].compareTo(c[j]) < 0) {
		            	
		               temp = c[i];
		               
		               c[i] = c[j];
		               
		               c[j] = temp;
		            }
		         }
		      }
	      
		      System.out.println(Arrays.toString(c));
	}
	
	// Count the length of a string
	public int countLengthString(String c) {
	    
		int j = 0;
		
		for(int i = 0; i < c.length(); i++) {
			c.charAt(i);
			j++;
		}
		 return j;   
	}

	
}

 class SecondClass {
	 
	 public void smallestNumber(int a[]) {
		 
		 int temp;

			for (int i = 0; i < a.length; i++) {

				for (int j = 0; j < a.length - 1; j++) {

					if (a[j] < a[j + 1]) { // < for Descending order

						temp = a[j + 1];

						a[j + 1] = a[j];

						a[j] = temp;
					}
				}
			}
			
		System.out.println(a[a.length-1]);	
	 }
	
}
