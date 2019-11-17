package iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaIterable {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();

		nums.add(1);
		nums.add(10);
		nums.add(12);
		nums.add(2);
		nums.add(5);

		System.out.println(nums);

		// before java 5:
		int index = 1;
		Iterator<Integer> iterator = nums.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
			if (index == 1) {
				iterator.remove();
				index++;
			}
		}
		System.out.println();
		System.out.println(nums);

		// from java 5:
		for (Integer num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();

	}
}
