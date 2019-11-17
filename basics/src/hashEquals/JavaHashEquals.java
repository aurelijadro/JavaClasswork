package hashEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaHashEquals {
	public static void main(String[] args) {
		// jei key yra objektas
		Map<Integer, String> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		
		map.put(1, "Laura");
	//	map.put(2, "Anna");
		map.put(1, "Laura");
		
		set.add(1);
	//	set.add(2);
		set.add(1);
		
		System.out.println(map);
		System.out.println(set);
		
		//hashkodas - objektas apdorojamas algoritmo ir gaunamas int
		//jei objektai turi vienoda hashcode'a - objektai tiketina yra vienodi
		//equals tikrina tik reference'us
		
		Map<People, Integer> mapObjects = new HashMap<>();
		Set<People> setObjects = new HashSet<>();
		
		People unit1 = new People(1, "Anna");
		People unit2 = new People (1, "Anna");
		
		mapObjects.put(unit1, 1);
		mapObjects.put(unit2, 2);
		
		setObjects.add(unit1);
		setObjects.add(unit2);
		
		System.out.println(mapObjects);
		System.out.println(setObjects);
		
		
	}
}
