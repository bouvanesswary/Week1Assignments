package week1.assignments;

public class CharOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "welcome to chennai";
		char[] charstr= str.toCharArray();
		int charlen=charstr.length;
		System.out.println("Original String Length "+charlen);
		
		String newstr=str.replace("e", "");
		//System.out.println("New String after removing e "+ newstr);
		int withoute=newstr.length();
		System.out.println("New String length "+ withoute);
		
		int e;
		e=charlen-withoute;
		System.out.println("Total count of e is "+ e);
		
	}

}
