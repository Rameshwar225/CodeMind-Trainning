package com.codemind.springboot1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean
	public Employee obj()
	{
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Rameshwar");
		e1.setSalary(35000);
		return e1;
		
	}

}
