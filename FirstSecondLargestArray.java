package week1.assignments;

import java.util.Arrays;

public class FirstSecondLargestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = { 3, 2, 11, 4, 6, 7 };
		Arrays.sort(data);
		System.out.println("Second largest element is "+data[data.length-2]);

		/*
		 * Pseudo Code: 1) Arrange the array in ascending order 2) Pick the 2nd element
		 * from the last and print it
		 */

	}

}
