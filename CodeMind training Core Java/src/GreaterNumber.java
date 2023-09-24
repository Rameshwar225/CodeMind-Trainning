import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter three numbers: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c= sc.nextInt();
		
		if(a>=b && a>=c)
		{
			System.out.println("Greater number is A");
		}
		
		else if(b>=a && b>=c)
		{
			System.out.println("Greater number is B");
		}
		else 
		{
			System.out.println("Greate number is C");
		}

	}

}
