import java.util.Scanner;

public class Reminder {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter divident: ");
		int a = sc.nextInt();
		
		System.out.println("Enter diviser");
		int b = sc.nextInt();
		
		System.out.println("Reminder: "+ (a%b));
		System.out.println("Quotient: "+ (a/b));

	}

}
