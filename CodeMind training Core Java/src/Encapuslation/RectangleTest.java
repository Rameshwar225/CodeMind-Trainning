package Encapuslation;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(10,20);
		int length= r1.getLength();
		int breath = r1.getBreath();
		
		int area = length*breath;
		
		System.out.println("The area of rectnagle is: "+ area);
		
		r1.setBreath(5);
		r1.setLength(10);
		
		int len = r1.getLength();
		int bre = r1.getBreath();
		
		int newArea = len*bre;
		
		System.out.println("New Area is: " + newArea);
		

	}

}
