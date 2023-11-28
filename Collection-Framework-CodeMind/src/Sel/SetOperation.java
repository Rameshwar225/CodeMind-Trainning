package Sel;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
public class SetOperation {
	
	public static void main(String[] args) {
		Set<Integer> rollnumber = new TreeSet<>();
		rollnumber.add(5);
		rollnumber.add(2);
		rollnumber.add(10);
		rollnumber.add(50);
		rollnumber.add(1);
		rollnumber.add(8);
		
		System.out.println("====================SET=========================");
		for(Integer val: rollnumber)
		{
			System.out.print(val +" ");
		}
		
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		System.out.println("===================LIST========================");
		for(Integer data: l1)
		{
			System.out.print(data +" ");
		}
		
		Queue<Integer> q1 = new ArrayDeque<>();
		
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		System.out.println("=================QUEUE=========================");
		for(Integer data:q1)
		{
			System.out.print(data +" ");
		}
		
		
		Map<Integer, String> map = new HashMap();
		map.put(1, "Rameshwar");
		map.put(2, "Lakhan");
		map.put(3, "Ramdas");
		map.put(4,  "kalyan");
		
		System.out.println("=================MAP===============================");
		
		for(Map.Entry<Integer,String> entry : map.entrySet())
		{
			System.out.print(entry.getKey() +" ");
			System.out.print(entry.getValue() +" ");
		}
		
		
		
		
	}
	
	
	
	
	

}
