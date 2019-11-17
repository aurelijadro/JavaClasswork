package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMapTester {

	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String>linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();
		
		fillMap(hashMap);
		System.out.println(hashMap); // gražina bet kokia tvarka
		fillMap(linkedHashMap);
		System.out.println(linkedHashMap); // gražina eilės tvarka kuria sudėjome
		fillMap(treeMap);
		System.out.println(treeMap); // gražina rušiuotą pagal key
		
		
		
		
		
		
	}
	
	private static void fillMap(Map<Integer, String> map) {
		map.put(1, "cat");
		map.put(15, "dog");
		map.put(7, "tiger");
		map.put(3, "bird");
	}

}
