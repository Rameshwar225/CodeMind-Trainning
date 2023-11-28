package List.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {
	
	public static void main(String[] args) {
		List<String> obj = new ArrayList<>(); 
		obj.add("Rameshwar");
		obj.add("Lakhan");
		obj.add("Ramdas");
		obj.add("Kalyan");
		obj.add("Suman");
		
		for(String data: obj)
		{
			System.out.println(data);
		}
		
//	using iterator
		System.out.println("=======================================USING ITERATOR INTERFACE========================================================");
		Iterator<String> iterator = obj.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		System.out.println("======================================USING LISTITERATOR=========================================");
		
		ListIterator<String> LI = obj.listIterator();
		while(LI.hasNext())
		{
			System.out.println(LI.next());
		}
	}

}
