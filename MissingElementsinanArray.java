package week1.day2;

import java.util.Arrays;

public class MissingElementsinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr={0,1,3,2,4,6,7,8};
// 5 missing
	
//for loop
for(int i=0;i<arr.length;i++)
{
	// Sort the array
	Arrays.sort(arr);
	if(arr[i]!=i)
	{
		System.out.println("Missinf element " +i);
	break;
}
//if(index != element)-->  Index is the missing element
	}
}
}