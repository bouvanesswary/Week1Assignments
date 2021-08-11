package week1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code
		 * a) Declare A String value as"madam"
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String value= "madam";
		String reverse="";
		for(int i=value.length()-1;i>=0;i--)
		{
			System.out.println(value.charAt(i));
			char newstr=value.charAt(i);
			reverse=reverse+newstr;
			
			//Char to string
			//String palstr=Character.toString(newstr);
			
		}
	System.out.println(reverse);
		
		
		
	}

}
