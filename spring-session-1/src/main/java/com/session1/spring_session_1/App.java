package com.session1.spring_session_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("/com/session1/spring_session_1/spring.xml");
        
        Employee e1 = (Employee)context.getBean("codemind1");
        System.out.println(e1);
    }
}
