package Inheritence;

public class Cat extends Animal{

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.setName("Shabri");
		c1.setLeg(4);
		c1.setTeil(true);
		
		System.out.println("Name: "+c1.getName()+" ,leg: "+ c1.getLeg() +" ,Tail: "+c1.isTeil());

	}

}
