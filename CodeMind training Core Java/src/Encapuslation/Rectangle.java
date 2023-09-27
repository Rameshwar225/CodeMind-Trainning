package Encapuslation;

public class Rectangle {
	
	
	private int length;
	private int breath;
	
	public Rectangle(int length, int breath)
	{
		this.length = length;
		this.breath = breath;
	}
	
	void setLength(int length)
	{
		this.length = length;
	}
	
	void setBreath(int breath)
	{
		this.breath = breath;
	}
	
	int getLength()
	{
		return length;
	}
	int getBreath()
	{
		return breath;
	}

}
