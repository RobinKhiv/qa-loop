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
		String[] lowNum = new String [] {"one","two","three","four","five"
				,"six","seven","eight","nine","ten","eleven","twelve", "thirteen"
				, "fourthteen", "fifthteen", "sixteen", "seventeen","eighteen","nineteen"};
		String[] specialNum = new String[] { "twenty", "thirty", "fourty", "fifty", "sixty"
				, "seventy","eigthy","ninety"};
		String result = "";
		String currentNum = Integer.toString(i);		
		char c = '\0';
		int k = 0;
		
		for(int j = 0; j < currentNum.length(); j++ ){
			//c = currentNum.charAt(j);
			k = Character.getNumericValue(currentNum.charAt(j));
			if(j > 0 && k == 0)
				break;
			if(currentNum.length() > 1 && j == 0) {
				if(k > 1)
					result = result + specialNum[k - 2];	
				else {
					result = result + lowNum[i - 1];
					break;
				}
			} else 
				result = result + lowNum[k - 1];
		}
		return result;
	}
}
