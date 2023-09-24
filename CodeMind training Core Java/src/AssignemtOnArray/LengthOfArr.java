package AssignemtOnArray;

public class LengthOfArr {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		
		int count = 0;
		
//		for(int i=0;i<=arr.length;i++)
//		{
//			if(i >= arr.length)
//			{
//				break;
//			}
//			else
//			{
//				count++;
//			}
//		}
		
		for(int arr1: arr)
		{
			count++;
		}
		System.out.println(count);

	}

}
