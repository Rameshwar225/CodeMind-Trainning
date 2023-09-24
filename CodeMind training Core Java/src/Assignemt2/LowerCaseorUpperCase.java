package Assignemt2;

import java.util.Scanner;

public class LowerCaseorUpperCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter character: ");
		char c = sc.next().charAt(0);
		
		System.out.println("Enterd charater is in: "+test(c));

	}
	
	static String test(char c)
	{
		if(c >= 65 && c<=90)
		{
			return "Upper case";
		}
		else if(c >=97 && c <= 122)
		{
			return "Lower case";
		}
		else {
			return "Wrong input";
		}
	}

}
