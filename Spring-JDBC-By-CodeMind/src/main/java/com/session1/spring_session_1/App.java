package com.session1.spring_session_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/session1/spring_session_1/spring.xml");
        
        Employee e1 = new Employee();
        JdbcTemplate temp =  context.getBean("jdbctemplete", JdbcTemplate.class);
        String query = "insert into Employee values(?,?)";
        e1.setName("Rameshwar");
        e1.setSalary(35000);
        int result= temp.update(query,e1.getName(),e1.getSalary());
        System.out.println("Data added: "+ result);
        
        
    }
}
