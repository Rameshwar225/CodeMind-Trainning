package ThisKeyWord;

public class Animal {
	
	private int NoofLegs;
	private String name;
	private String color;
	
	
	Animal()
	{
		System.out.println("This is the constructor of Animal class");
	}
	
	Animal(String aname)
	{
		this();
		System.out.println("Parameterized");
	}


	public int getNoofLegs() {
		return NoofLegs;
	}


	public void setNoofLegs(int noofLegs) {
		
		this.NoofLegs = noofLegs;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

}
