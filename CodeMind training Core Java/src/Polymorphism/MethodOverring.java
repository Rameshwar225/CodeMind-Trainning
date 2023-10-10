package Polymorphism;


class car{
	car speed()
	{
		System.out.println("Car has speed");
		return new car();
	}
	
	void stop()
	{
		System.out.println("Car stop");
	}
	void start()
	{
		System.out.println("Car started");
	}
}

class hondacity extends car
{
	hondacity speed()
	{
		
		System.out.println("Honda city has speed");
		return new hondacity();
	}
}
public class MethodOverring {

	public static void main(String[] args) {
		car h1 = new hondacity(); //this process is called upcasting
		h1.speed();
		h1.start();
		h1.stop();

	}

}
 