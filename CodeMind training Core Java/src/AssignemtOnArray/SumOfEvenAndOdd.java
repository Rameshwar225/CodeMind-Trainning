package AssignemtOnArray;

public class SumOfEvenAndOdd {

	
	static void sum(int arr[])
	{
		int sumofeven = 0;
		int sumofodd  = 0;
		
		for(int i = 0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				sumofeven = sumofeven + arr[i];
			}
			else
			{
				sumofodd = sumofodd + arr[i];
			}
		}
		
		
		System.out.println("Sum of Even: "+ sumofeven);
		System.out.println("Sum of Odd: "+ sumofodd);
		
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		sum(arr);

	}

}
