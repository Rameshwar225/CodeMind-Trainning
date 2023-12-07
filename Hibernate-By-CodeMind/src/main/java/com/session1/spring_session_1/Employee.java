package com.session1.spring_session_1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="Employee")
public class Employee {
	@Id
	public int id;
	@Column
	public String name ;
	@Column
	public int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getId() {
		return salary;
	}
	public void setId(int salary) {
		this.salary = salary;
	}
	
	
	

}
