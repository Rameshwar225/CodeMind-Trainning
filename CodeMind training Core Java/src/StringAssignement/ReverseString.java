package StringAssignement;

public class ReverseString {
	
	static void reverseString(String str)
	{
		char[] strarr = str.toCharArray();
		
		for(int i= strarr.length-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		
		String str = "Hello buddy";
		reverseString(str);
		

	}

}
