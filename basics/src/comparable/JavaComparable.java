package comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JavaComparable {

	public static void main(String[] args) {
		List<Phone> phonesList = new ArrayList<>();
		Set<Phone> phoneSet = new TreeSet<>(); // set'as turi zinoti pagal ka rusiuoti!!!! class implements comparable

		addElements(phonesList);
		addElements(phoneSet);
		System.out.println(phonesList);
		System.out.println(phoneSet);

	}

	private static void addElements(Collection collection) {
		collection.add(new Phone("Pink", 756));
		collection.add(new Phone("Lylac", 1064));
		collection.add(new Phone("Silver", 2000));
		collection.add(new Phone("Blue", 360));
	}

}
