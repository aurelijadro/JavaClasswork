package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaComparator {
	public static void main(String[] args) {
		List<String> animals = new ArrayList<>();
		animals.add("cat");
		animals.add("dog");
		animals.add("fish");
		animals.add("snake");
		animals.add("bird");

		Collections.sort(animals); // natural order
		System.out.println(animals);

		List<Integer> nums = new ArrayList<>();
		nums.add(55);
		nums.add(14);
		nums.add(3);
		nums.add(99);
		nums.add(-2);
		nums.add(13);
		nums.add(22);

		Collections.sort(nums); // natural order
		System.out.println(nums);

		Collections.sort(animals, new JavaStringComparator()); // comparator'ius leidzia atsisakyti naturalios rusiavimo
																// tvarkos
		System.out.println(animals);

		Collections.sort(nums, new JavaIntegerComporator());
		System.out.println(nums);

		List<Developer> developers = new ArrayList<>();
		developers.add(new Developer(1500));
		developers.add(new Developer(10254));
		developers.add(new Developer(1254));
		developers.add(new Developer(516));
		developers.add(new Developer(0));

		Collections.sort(developers, new JavaDeveloperComparator());
		System.out.println(developers);

		Collections.sort(developers, new Comparator<Developer>() { // comparator'ius anonimineje klaseje

			@Override
			public int compare(Developer o1, Developer o2) {
				if (o1.getCodeLines() > o2.getCodeLines()) {
					return 1;
				} else if (o1.getCodeLines() < o2.getCodeLines()) {
					return -1;
				} else {
					return 0;
				}
			}
		});

		System.out.println(developers);

	}
}
