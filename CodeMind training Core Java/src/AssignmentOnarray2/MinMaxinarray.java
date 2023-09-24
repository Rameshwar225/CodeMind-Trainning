package AssignmentOnarray2;

public class MinMaxinarray {

	static int minval(int arr[])
	{
		int min = arr[0];
		
		for(int i = 1;i<arr.length;i++)
		{
			if(arr[i] <min )
			{
				min = arr[i];
			}
		}
		return min;
		
				
	}
	
	static int maxval(int arr[])
	{
		int max = arr[0];
		
		for(int i = 1;i<arr.length;i++)
		{
			if(arr[i] > max )
			{
				max = arr[i];
			}
		}
		return max;
		
				
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,-6};
		System.out.println("Min element is: "+ minval(arr));
		System.out.println("Min element is: "+ maxval(arr));
	}
}
