package generics;

public class JavaGenericsMEthods {
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, -3, 4, 5 };
		Double[] doubleArray = { 1.1, 20.3, 4.5, 7.8, 6.66 };
		String[] stringArray = { "one", "z", "two", "three", "four", "five" };

		printArray(intArray);
		printArray(doubleArray);
		printArray(stringArray);

		findMax(intArray);
		findMax(doubleArray);
		findMax(stringArray);

		// DRY!!!

	}

//	private static void printArray(String[] stringArray) {
//		System.out.println("Non generic method!");
//		for (String string : stringArray) {
//			System.out.print(string + " ");
//		}
//		System.out.println();
//
//	}
//
//	private static void printArray(Double[] doubleArray) {
//		System.out.println("Non generic method!");
//		for (Double num : doubleArray) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
//
//	}
//
//	private static void printArray(Integer[] intArray) {
//		System.out.println("Non generic method!");
//		for (Integer num : intArray) {
//			System.out.print(num + " ");
//		}
//		System.out.println();
//
//	}

	// generic'uose galima naudoti wild cards!

	private static <T> void printArray(T[] array) {
		System.out.println("Generic method!");
		for (T element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	private static <T extends Comparable<T>> T findMax(T[] array) {
		System.out.println("Generic method!");
		T max = array[0];
		for (T element : array) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		System.out.println("Find max: " + max);
		return max;
	}

}
