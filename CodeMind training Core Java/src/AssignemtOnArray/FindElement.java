package AssignemtOnArray;

public class FindElement {
	void find(int arr[],int key)
	{
		int temp = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == key)
			{
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Give element found "+temp+" time");
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,7,4,5,6,7};
		
		int key = 4;
		
		FindElement f1 = new FindElement();
		f1.find(arr, key);

	}

}
