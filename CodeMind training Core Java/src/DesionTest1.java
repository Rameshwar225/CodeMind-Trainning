import java.util.Scanner;

public class DesionTest1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		DesionTest1 obj = new DesionTest1();
		obj.checkEligibilityif(age);
		
		obj.checkEligibilityifelse(age);
		
		obj.checkEligibilityifelseif(age);
		
		char c = 'z';
		obj.switchcase(c );
	}
	
	
	void checkEligibilityif(int age)
	{
		if(age>=18)
		{
			System.out.println("Congratulation you Eligible for Voting");
		}
	}
	
	void checkEligibilityifelse(int age)
	{
		if(age>=18)
		{
			System.out.println("Congratulation you Eligible for Voting");
		}
		else
		{
			System.out.println("Sorry not Eligible for Voting");
		}
	}
	
	
	void checkEligibilityifelseif(int age)
	{
		if(age>=18 && age <=60)
		{
			System.out.println("Congratulation you Eligible for Voting");
		}
		else if (age >=18 && age >=60)
		{
			System.out.println("You Eligible for voting and you are sinior citison");
		}
		else
		{
			System.out.println("Sorry not Eligible for Voting");
		}
	}
	
	void switchcase(char c)
	{
		switch(c)
		{
		case 'a':
			System.out.println("Ovel");
			break;
			
		case 'e':
			System.out.println("Ovel");
			break;
		
		case 'i':
			System.out.println("Ovel");
			break;
			
		case 'o':
			System.out.println("Ovel");
			break;
			
		case 'u':
			System.out.println("Ovel");
			break;
			
		default:
			System.out.println("Not a ovel");
			break;
		}
	}

}
