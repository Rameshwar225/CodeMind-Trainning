package AssignmentOnarray2;

public class ReverseArray {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		int rev[] = reverse(arr);
		
		for(int val: rev)
		{
			System.out.print(val +" ");
		}
		
	}
	
	static int[] reverse(int arr[])
	{
		int rev[] = new int[arr.length];
		
		int j=0;
		for(int i = arr.length-1;i>=0;i--)
		{
			rev[j] = arr[i];
			j++;
		}
		return rev;
	}

}
