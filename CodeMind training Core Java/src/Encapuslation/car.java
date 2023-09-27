package Encapuslation;

public class car 
{
	private String name;
	private String model;
	private String Company;
	private float speed;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	void setSpeed(float speed)
	{
		if(speed > 0)
		{
		this.speed = speed;
		}
		else
		{
			System.out.println("Speed is incorrect");
			this.speed = 0;
		}
	}
	
	float getSpeed()
	{
		return speed;
	}
	
	//Encapsulation -> biding data into single unit and provide the security also to that data using getters and setters 
	
}




