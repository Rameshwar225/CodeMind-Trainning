package com.session1.spring_session_1;

import org.hibernate.Session;

public class App 
{
    public static void main( String[] args )
    {
    	Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();	
    	
    	Employee e1 = new Employee();
    	e1.setId(2);
    	e1.setName("lax");
    	e1.setSalary(35000);
    	
    	session.save(e1);
    	System.out.println("data Inserted sucessful");
    	
       
            }
}
