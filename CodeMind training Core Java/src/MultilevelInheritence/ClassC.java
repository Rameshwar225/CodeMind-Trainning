package MultilevelInheritence;

public class ClassC extends ClassB{
	
	void classCMethod()
	{
		System.out.println("Class C Method");
	}

	public static void main(String[] args) {
		
		ClassC c1 = new ClassC();
		c1.classAMethod();
		c1.classBMethod();
		c1.classCMethod();
		

	}

}
