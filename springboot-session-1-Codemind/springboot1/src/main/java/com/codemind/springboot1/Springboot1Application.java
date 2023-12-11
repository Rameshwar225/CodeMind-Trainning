package com.codemind.springboot1;

import org.apache.catalina.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(Springboot1Application.class, args);
		Employee e1 = context.getBean(Employee.class);
		System.out.println(e1);
	
	}

}
