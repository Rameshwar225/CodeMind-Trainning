package Sel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sortingcustome {

    public static void main(String[] args) {

        List<Student> s1 = new ArrayList<>();
        s1.add(new Student(2, "Lakhan", 98));
        s1.add(new Student(1, "Rameshwar", 70));
        s1.add(new Student(3, "Ajay", 35));
        s1.add(new Student(1, "Aniket", 80));
        s1.add(new Student(1, "Begam", 40));
        s1.add(new Student(1, "Tanishka", 90));
        s1.add(new Student(1, "Rutuja", 90));

        
        Collections.sort(s1);

        
        for (Student student : s1) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student> {
    private int id;
    private String name;
    private int marks;

    @Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}



	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}


	@Override
    public int compareTo(Student o) {
        return o.marks - this.marks;
    }
}
