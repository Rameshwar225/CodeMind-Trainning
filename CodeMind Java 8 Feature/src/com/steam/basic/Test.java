package com.steam.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer>mylist = Arrays.asList(4,5,7,8,1,2,3,7,10,11,15);
		
		
		List<Integer>limit5=mylist.stream().limit(5).collect(Collectors.toList());
		System.out.println(limit5);
		
		System.out.println(mylist.stream().sorted().collect(Collectors.toList()));
		System.out.println(mylist.stream().count());

	}

}
