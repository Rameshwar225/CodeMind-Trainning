package AssignmentOnarray2;

public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		int a[] = {1,4,2,1,3,5,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] == a[j])
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	
	}

}
