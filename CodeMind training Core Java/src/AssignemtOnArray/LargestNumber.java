package AssignemtOnArray;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);

	}

}
