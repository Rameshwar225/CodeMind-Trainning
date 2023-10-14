package StaticBlock;

public class Check {

	
	static int rno;
	static String name;
	
	static {
		System.out.println("Inside static block 1");
		rno = 10;
		name ="Ram";
	}
	
	static {
		System.out.println("Inside static block 2");
		rno = 20;
		name = "lakhan";
	}
	public static void main(String[] args) {
		
		System.out.println("Inside main method");
		System.out.println(Check.rno);
		System.out.println(Check.name);

	}

}
