package week1.assignments;

public class ChangeIndextoUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Pseudo Code Declare String Input as Follow String test = "changeme"; a)
		 * Convert the String to character array b) Traverse through each character
		 * (using loop) c)find the odd index within the loop (use mod operator) d)within
		 * the loop, change the character to uppercase, if the index is odd else don't
		 * change
		 */
		String str="changename";
		char[] charstr=str.toCharArray();
		
		for(int i=0;i<charstr.length;i++)
		{
			if(i%2==0) {
				System.out.println(Character.toUpperCase(charstr[i]));
			}
			else {
				System.out.println(charstr[i]);
			}
				
		}
	}

	
}
