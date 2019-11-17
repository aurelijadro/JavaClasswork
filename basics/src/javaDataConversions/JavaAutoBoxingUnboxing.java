package javaDataConversions;

public class JavaAutoBoxingUnboxing {
	public static void main(String[] args) {
		// AutoBoxing:

		Integer integerObject = 7; // autoboxingas kai primityvas ikeliamas i kevala ir tampa objektu
		System.out.println(integerObject);

		Character charObject = 'a';
		char a = 'a';
		System.out.println(charObject);

		// AutoUnboxing:

		int primitiveInt = integerObject;
		System.out.println(primitiveInt);

		// Expressions:
		Integer integerObject1 = 7;
		Integer integerObject2 = 15;
		System.out.println(integerObject1 + integerObject2); // vyksta autounboxing!

		// Method level:

		Integer integerObject3 = 10;
		method(integerObject3);

	}

	private static void method(int num) { // autounboxing!
		System.out.println(num);

	}
}
