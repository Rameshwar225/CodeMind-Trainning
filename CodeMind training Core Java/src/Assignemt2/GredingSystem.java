package Assignemt2;

import java.util.Scanner;

public class GredingSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		System.out.println("Your gread is: "+gread(marks));
	}
	
	static char gread(int marks)
	{
		if(marks < 25 )
		{
			return 'F';
		}
		else if(marks <=45 && marks >= 25)
		{
			return 'E';
		}
		else if(marks <=50 && marks >=46)
		{
			return 'D';
		}
		else if(marks <=60 && marks >=51)
		{
			return 'C';
		}
		
		else if(marks <=80 && marks >=61)
		{
			return 'B';
		}
		
		else if(marks <=100 && marks >=81)
		{
			return 'A';
		}
		
		else {
			return 0;
		}
	}

}
