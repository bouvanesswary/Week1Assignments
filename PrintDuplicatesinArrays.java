package week1.assignments;

public class PrintDuplicatesinArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 17, 20};

		// get the length of the array
		int arrayLength = arr.length;

		// declare an int variable named count
		int count;

		// iterate from 0 to the array length-1 (outer loop starts here)
		for (int i = 0; i < arr.length; i++) {
			// assign 0 to count
			count = 1;
			// iterate from i to the length of the array by adding 1 to it (inner loop
			// starts here)

			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					//System.out.println(arr[i]);
					arr[j]=0;
				}
			}
			if(count>1 && arr[i]!=0)
				System.out.println(arr[i]);
		}
		// compare both the loop variables & check they're equal

		// increase the count if both the arrays are equal

		// Out of the inner loop, check and print the first array variable if count is
		// more than 0

	}

}
