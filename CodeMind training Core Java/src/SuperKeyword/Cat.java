package SuperKeyword;

public class Cat extends Animal {
	
	void show()
	{
		System.out.println("this is in Cat class(child class)");
	}
	
	Cat()
	{
		System.out.println("This is in child class");
	}
	
	void display()
	{
		
		super.show();
	}

}
