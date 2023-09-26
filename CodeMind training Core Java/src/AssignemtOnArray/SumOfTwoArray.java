package AssignemtOnArray;

public class SumOfTwoArray {

	static void sum(int arr1[], int arr2[])
	{
		int arr[] = new int[arr1.length];
		
		for(int i =0; i< arr.length;i++)
		{
			arr[i] = arr1[i] + arr2[i];
		}
		for(int val: arr)
		{
			System.out.print(val+" ");
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		int arr2[] = {1,2,3,4,5};
		
		sum(arr, arr2);
	}

}
