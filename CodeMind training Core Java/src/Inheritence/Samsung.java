package Inheritence;

public class Samsung extends Mobile {
	
	private String waterregister;
	
	public String getWaterregister() {
		return waterregister;
	}

	public void setWaterregister(String waterregister) {
		this.waterregister = waterregister;
	}

	public static void main(String[] args) {
		Samsung obj = new Samsung();
		obj.setCompany("Samsung");
		obj.setModel("A31");
		obj.setPrice(16000);
		
		obj.show();
		obj.getDetails();
		obj.setWaterregister("Yes");
		
		System.out.println(obj.getWaterregister());
	}
}
