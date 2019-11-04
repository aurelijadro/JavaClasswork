package lists;

import java.util.ArrayList; //interfeisas = kontraktas, susitarimas
import java.util.LinkedList;
import java.util.List;
	// array list'ai priima tik objektus! Primityvu nepriima

public class JavaArrayList {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>(); //dinaminis sąrašas = objektas, pagal nutilejima uzima vietos 10 elementu
		names.add("Tom");
		names.add("Laura");
		names.add("Peter");
		names.add(1, "new"); // adds element in the list[1]
		System.out.println(names);
		names.add("Mike");
		System.out.println(names);
		names.add(3, "Kate");
		System.out.println(names);
		
		System.out.println(names.indexOf("Kate")); // returns index of first found "Kate"
		System.out.println(names.size());
		System.out.println(names.get(2)); 
		
		for (String name : names) {
			System.out.println(name);
		}
		
		names.set(0, "Kevin");
		System.out.println(names);
		
		ArrayList<People> people = new ArrayList<People>();
		people.add(new People ("Anna", 15));
		System.out.println(people);
		
		List<Integer> nums = new LinkedList<Integer>(); // linked list kiekvienas elementas turi savo dezute
		nums.add(1);
		nums.add(15);
		

	}

}
