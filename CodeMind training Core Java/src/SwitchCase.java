import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		System.out.println("Enter Character: ");
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
		
		SwitchCase obj = new SwitchCase();
		obj.switchcase(c);

	}

	void switchcase(char c)
	{
		switch(c)
		{
		case 'a':
		case 'A':
			System.out.println("Ovel "+c);
			break;
			
		case 'e':
		case 'E':
			System.out.println("Ovel "+c);
			break;
		
		case 'i':
		case 'I':
			System.out.println("Ovel "+c);
			break;
			
		case 'o':
		case 'O':
			System.out.println("Ovel "+c);
			break;
			
		case 'u':
		case 'U':
			System.out.println("Ovel "+ c);
			break;
			
		default:
			System.out.println("Not a ovel "+c);
			break;
		}
	}
}
