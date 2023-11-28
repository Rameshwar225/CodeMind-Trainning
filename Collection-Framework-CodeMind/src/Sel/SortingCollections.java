package Sel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

	public static void main(String[] args) {
		List<String> name = new ArrayList<String>();
		name.add("Rameshwar");
		name.add("Amit");
		name.add("Beby");
		name.add("Chetan");
		name.add("Dinesh");
		
		Collections.sort(name);
		System.out.println(name);
		
		
		
	}

}
