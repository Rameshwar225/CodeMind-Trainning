package AssignemtOnArray;

import java.util.Scanner;

public class SumOfArrayElements {

	int sum(int arr1[])
	{
		int sum=0;
		for(int i=0;i<=arr1.length-1;i++)
		{
			sum = sum+ arr1[i];
		}
		
		return sum;
	}
	
	
	public static void  main(String args[])
	{
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter array Element");
		SumOfArrayElements s1 = new SumOfArrayElements();
		
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The sum of array Element is: "+s1.sum(arr) );
	}
}
