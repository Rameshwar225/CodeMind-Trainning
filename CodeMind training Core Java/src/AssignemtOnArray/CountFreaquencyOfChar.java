package AssignemtOnArray;

public class CountFreaquencyOfChar {

	public static void main(String[] args) {
		
		int arr[] = {4,4,5,6,7,8,41,5,5,5,5,5,1,1,1,1,1,1,1,1,1};
		int count = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			count = 1;
			for(int j = i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					count++;
				}
			}
			System.out.println(arr[i]+": "+count);
			System.out.println("Wrong code");
		}

	}

}
