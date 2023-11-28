package com.lambda.with.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class test {

	public static void main(String[] args) {
		List<String>weekdays = Arrays.asList("sun","mon","Tue","thirsday","fry","wed","sat");
		
		Consumer example = (x) -> System.out.print(x +" ");
		weekdays.forEach(example); //for Each method get the object of Condumer class and consumer is a functional interface
		
		System.out.println();
		System.out.println("**************************************");
		//we can directly do it using another way like below
		
		weekdays.forEach((x)->System.out.print(x+" "));

	}

}
