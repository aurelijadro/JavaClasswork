package arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaArrayList {
	public static void main (String[] args) {
//		int [] nums = new int [3];
//		for (int i = 0; i < 4; i++) { // masyvo ilgis out of bounds!!!
//			nums[i] =1;
//		}
		
		List<Integer> nums = new ArrayList<Integer>(); //tuscias dinaminis masyvas
		for (int i = 0; i < 10; i++) {
			System.out.print(nums.add(i));
			
		}
		System.out.println("\n" + nums);
		
		nums.remove(5);
		
		System.out.println("\n" + nums);
		List<Integer> linkedList = new LinkedList<Integer>(nums);
		System.out.println(linkedList);
		System.out.println(linkedList.getClass());
		
		// for + forEach sarasu apejimui (foreach nes implementuoja iterable)
		
		
		
		
		
	}
}
