package Assignemt2;

import java.util.Scanner;

public class PositiveNumberorNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		check(num);
		
	}
	
	static void check(int num)
	{
		if(num >=0)
		{
			System.out.println("Positive number: "+num);
		}
		else if(num<0)
		{
			System.out.println("Negative number: "+num);
		}
		else
		{
			System.out.println("Wrong input");
		}
	}

}
