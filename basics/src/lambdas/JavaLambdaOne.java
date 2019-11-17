package lambdas; //anonimines funkcijos

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JavaLambdaOne {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();

		names.add("Anna Bannana");
		names.add("Elsa");
		names.add("Eliot");
		names.add("Anna");

		names.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() > o2.length()) {
					return 1;
				}
				if (o1.length() < o2.length()) {
					return -1;
				}
				return 0;
			}

		});

		System.out.println(names);

		names.sort((s1, s2) -> {
			if (s1.length() > s2.length()) {
				return -1;
			}
			if (s1.length() < s2.length()) {
				return 1;
			}
			return 0;
		});

		System.out.println(names);

	}

}
