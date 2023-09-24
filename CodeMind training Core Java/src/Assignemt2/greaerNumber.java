package Assignemt2;

import java.util.Scanner;

public class greaerNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();
		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();
		check(num1,num2);
	}
	
	static void check(int num1,int num2)
	{
		if(num1 > num2)
		{
			System.out.println(num1+ " is greater than "+num2);
		}
		else if(num1 < num2)
		{
			System.out.println(num2+ " is greater than "+num1);
		}
		else 
		{
			System.out.println("Both number are same");
		}
	}

}
