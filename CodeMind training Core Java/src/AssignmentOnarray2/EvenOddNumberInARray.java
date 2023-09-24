package AssignmentOnarray2;

public class EvenOddNumberInARray {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		for(int i =0;i<a.length;i++)
		{
			if(a[i] %2==0)
			{
				System.out.print("Even: "+ a[i]);
			}
			else
			{
			
				System.out.print("Odd: "+ a[i]);
			}
		}

	}

}
