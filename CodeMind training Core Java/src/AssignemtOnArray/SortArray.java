package AssignemtOnArray;

public class SortArray {

	public static void main(String[] args) {
		
		int arr[] = {6,5,4,3,2,1,-6};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] >= arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i: arr)
		{
			System.out.print(i+ " ");
		}

	}

}
