package Inheritence;

public class Mobile {
	
	private String Company;
	private String Model;
	private int price;
	
	void show()
	{
		System.out.println("Basic Details: "+ Company +" Model: "+Model+" Price: "+ price);
		
	}
	
	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	void getDetails()
	{
		System.out.println("Get details Method");
		
	}

}
