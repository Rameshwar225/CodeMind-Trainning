package PolymorphismAssignment;

class calculation
{
	void Area(float length, float breath)
	{
		System.out.println(length * breath);
	}
	
	void Area(float redius)
	{
		System.out.println(3.14*redius*redius);
	}
	
	
}


public class AssignemntonOverloding {
	
	public static void main(String[] args) {
		calculation c1 = new calculation();
		c1.Area(2.0f);
		c1.Area(10.00f,20.00f);
		
		
		

	
}

}
