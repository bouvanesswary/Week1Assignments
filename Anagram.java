package week1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		 * 
		 * Declare a String String text1 = "stops"; Declare another String String text2
		 * = "potss"; a) Check length of the strings are same then (Use A Condition) b)
		 * Convert both Strings in to characters c) Sort Both the arrays d) Check both
		 * the arrays has same value
		 * 
		 */

		String text1 = "stops";
		String text2 = "potss";
		int text1str = text1.length();
		int text2str = text2.length();
		
		System.out.println(text1str);
		System.out.println(text2str);
		
		if (text1str == text2str) {
			char[] text1char = text1.toCharArray();
			char[] text2char = text2.toCharArray();
			System.out.println(text1char);
			System.out.println(text2char);
			
			Arrays.sort(text1char);
			Arrays.sort(text2char);
			
			boolean result= Arrays.equals(text1char,text2char);
			
			if(result)
			{
				System.out.println(text1+ " and " + text2 +" are Anagram.");
			}
			else {
				System.out.println(text1+ " and " + text2 +" are not Anagram.");
			}
						//System.out.println(text1char);
			//System.out.println(text2char);
				
	}
	}

}
//Another Method

 String text1 = "stops";
		String text2 = "potss";
		int text1str = text1.length();
		int text2str = text2.length();
		
		System.out.println(text1str);
		System.out.println(text2str);
			
			char[] text1char = text1.toCharArray();
			char[] text2char = text2.toCharArray();
		    System.out.println(text1char);
			System.out.println(text2char);
		
		Arrays.sort(text1char);
			Arrays.sort(text2char);
		
		if (text1str == text2str) {
						System.out.println(text1+ " and " + text2 +" are Anagram.");
			}
			else {
				System.out.println(text1+ " and " + text2 +" are not Anagram.");
			}
						//System.out.println(text1char);
			//System.out.println(text2char);
				
	}
	}


