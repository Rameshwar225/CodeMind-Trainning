package Polymorphism;

class Calculation
{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
}


public class MethodOverloading {

	public static void main(String[] args) {
		Calculation c1 = new Calculation();
		c1.add(1, 2);
		c1.add(1, 2, 3);

	}

}
