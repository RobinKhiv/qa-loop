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
	//Create a second method that when given the number 1-99 returns a String representation of this number, for example 1 = one, 11 = eleven, 21 = twenty-one.
			//Expand on the method you wrote in Numbers 2 to allow the input 1-999.
			//Expand the method you wrote in Numbers 2 to allow the input 1-9999

	//Numbers Revisited		
	//Use a for()-loop to print the numbers 1-100 in words.
	//For example; 1 = one, 100 = one hundred.
			
	//Given a cost and an amount, work out the change given in specific coinage.
	//For example; the cost is £4.58 and the customer pays with a £20 note so as change they receive:
	//1 £10 note
	//1 £5 note
	//2 20p's
	//1 2p
}
