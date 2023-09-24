package Assignment1;

public class PowerOfNUmberr {

	public static void main(String[] args) {
		int base = 10;
		int power = 2;
		
		int result =1;
		int i=1;
		
		while(i<=power)
		{
			result = result * base;
			i++;
		}
		System.out.println(result);

	}

}
