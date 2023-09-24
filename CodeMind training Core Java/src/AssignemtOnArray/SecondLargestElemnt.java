package AssignemtOnArray;

import java.util.Arrays;

public class SecondLargestElemnt {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,5,5,5,5,5,5};
		Arrays.sort(arr);
		
		int iterator =0;
		for(int i= arr.length-1;i>=0;i--)
		{
			
			if(i!=0)
			{
			 if(arr[i] != arr[i-1])
			{
				System.out.println(arr[i-1] +" is 2nd largest element");
				iterator++;
				break;
			}
			}
		}
		
		if(iterator == 0)
		{
			System.out.println("All the element are in array is same");
		}
		


	}

}
