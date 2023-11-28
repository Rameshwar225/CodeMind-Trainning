package com.lamda.basic.example;

public class Main {

	public static void main(String[] args) {
		
		FuctinalInterface Lambda = ()->{
			System.out.println("this is the lambda expression");
			System.out.println("FuctinalInterface is a fuctional interface cause it have only one method");
		};
		Lambda.greating();

	}

}
