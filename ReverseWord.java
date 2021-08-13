package week1.assignments;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare the input as Follow
		String str = "I am a software tester";
		// a) split the words and have it in an array
		// char[] strarray=str.toCharArray();
		String[] word = str.split("");
		// b) Traverse through each word (using loop)
		for (int i = 0; i < word.length; i++)
		{
			if (i % 2 == 0) 
			{

				int oddindexword = word[i].length();

				for (int j = oddindexword - 1; j > 0; j--)
				{
					System.out.print(word[i].charAt(j));
					
					
				}
				System.out.print(" ");
				
			} 
			else 
			{
				System.out.print(word[i] + " ");
			}
		}

		// c) find the odd index within the loop (use mod operator)

		// d)split the words and have it in an array

		// e)print the even position words in reverse order using another loop (nested
		// loop)
		// f) Convert words to character array if the position is even else print the
		// word as it is(concatenate space at the end).

	}
}
