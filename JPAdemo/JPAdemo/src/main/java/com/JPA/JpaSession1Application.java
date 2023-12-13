package com.JPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JpaSession1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JpaSession1Application.class, args);
		StudentData student = context.getBean(StudentData.class);

		StudentInterface s1 = context.getBean(StudentInterface.class);
		s1.save(student);
		System.out.println(s1.count());

		s1.findAll().forEach(x -> {

			System.out.println(x);

		});

	}

}
