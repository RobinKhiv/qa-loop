package com.qa.main;

public class Number {
	// Create a method that takes a number 10-99, 
	// and adds the two digits together for example 74 = 7 + 4 = 11.
	public static int add(int i, int j) {
		return i+j;
	}
	
	// Create a second method that when given the number 1-99 
	// returns a String representation of this number, for 
	// example 1 = one, 11 = eleven, 21 = twenty-one.
	public static String getString(int i) {
		String[] nums = new String [] {"one","two","three","four","five"
				,"six","seven","eight","nine","ten","eleven","twelve", "thirteen"
				, "fourthteen", "fifthteen", "sixteen", "seventeen","eighteen","nineteen"};
		
		String[] prefixs = new String[] { "twenty", "thirty", "fourty", "fifty", "sixty"
				, "seventy","eigthy","ninety"};
		String result = "";
	
		int prefix = i/10;
		int postfix = i % 10;
		
		if(i >= 20) {
			result = prefixs[prefix - 2];
			if(postfix != 0) 
				result = result + "-"+ nums[postfix -1];		
		}
		else
			result+= nums[i - 1];
		
		return result;
	}
}
