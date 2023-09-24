package AssignemtOnArray;

public class ReverseArrayInSameArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7};
		int temp ;
		int j = arr.length-1;
		for(int i=0;i<=arr.length/2;i++)
		{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				j--;
			
		}
		
		for(int val: arr)
		{
			System.out.print(val +" ");
		}
	}

}
