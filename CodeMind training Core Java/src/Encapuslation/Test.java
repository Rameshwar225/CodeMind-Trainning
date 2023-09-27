
package Encapuslation;


public class Test {

	public static void main(String[] args) {
		car obj = new car();
		
		obj.setSpeed(80.78f);
		obj.setCompany("XYZ");
		obj.setModel("PQR");
		obj.setName("ABC");
		
		System.out.println("Compnay: " +obj.getCompany());
        System.out.println("Model: "+ obj.getModel());
        System.out.println("Name: " + obj.getName());
		System.out.println("Speed: "+ obj.getSpeed());
		
		
		
		

	}

}
