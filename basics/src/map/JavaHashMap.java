package map;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {
	public static void main(String[] args) {
		Map<Integer, String> names = new HashMap<>();
		names.put(1, "Anna");
		names.put(3, "Dan");
		names.put(2, "Lara");
		System.out.println(names);//hashmap neuztikrina, kad duomenys bus grazinti tokia pat tvarka, kaip buvo sudeti
	
	
		Map <String, String> otherMap = new HashMap<>();
		otherMap.put("Blue", "Bird");
		otherMap.put("Green", "Dinosaur");
		otherMap.put("Pink", "Unicorn");
		System.out.println(otherMap);
		
		for (Map.Entry<String, String> entry : otherMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
