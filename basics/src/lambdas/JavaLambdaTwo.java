package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class JavaLambdaTwo {
	public static void main(String[] args) {
		int[] intArray = new int[10];
		List<Integer> intList = new ArrayList<>();

		fillArray(intArray);
		fillList(intList);
		System.out.println(Arrays.toString(intArray));
		System.out.println(intList);

		// map method:
		intArray = Arrays.stream(intArray).map(el -> el * 5).toArray(); // labai greitas, nes nereikia iteruotis!
		System.out.println(Arrays.toString(intArray));
		intArray = Arrays.stream(intArray).map(el -> el * 3).map(el -> el + 5).toArray();
		System.out.println(Arrays.toString(intArray));

		intList = intList.stream().map(el -> el + 3).collect(Collectors.toList());
		System.out.println(intList);

		// filter method:
		intArray = Arrays.stream(intArray).filter(el -> el % 2 == 0).toArray();
		System.out.println(Arrays.toString(intArray));

		// reduce method: (daug elementu -> vienas elementas)
		int arraySum = Arrays.stream(intArray).reduce((accumulator, b) -> accumulator + b).getAsInt();
		System.out.println(arraySum);
		Integer listSum = intList.stream().reduce((acc, b) -> acc + b).get();
		System.out.println(listSum);

		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(1);
		hashSet.add(8);
		hashSet.add(5);

		int sum = hashSet.stream().map(el -> el * 3).filter(el -> el % 2 != 0).reduce((acc, el) -> acc + el).get();
		System.out.println(sum);
	}

	private static void fillList(List<Integer> intList) {
		for (int i = 1; i <= 10; i++) {
			intList.add(i);
		}

	}

	private static void fillArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1;
		}

	}
}
