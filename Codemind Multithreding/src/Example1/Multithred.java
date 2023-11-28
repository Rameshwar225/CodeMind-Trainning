package Example1;

import java.util.Arrays;
import java.util.List;

class A{
	void months()
	{
		List<String>month = Arrays.asList("Jan", "Feb", "March","April","May","June","july");
		for(int i=0;i<=100;i++)
		{
			System.out.println(month);
		}
	}
	
	void week()
	{
		List<String>week = Arrays.asList("sun", "mon", "tue","Wed","thirdsday","fri","Sat");
		for(int i=0;i<=100;i++)
		{
			System.out.println(week);
		}
		
	}
}

public class Multithred {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				new A().months();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				new A().week();
				
			}
		});
		
		t1.start();
		t2.start();
		
	}

}
