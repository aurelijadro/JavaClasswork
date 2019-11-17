package comparator;

import java.util.Comparator;

public class JavaStringComparator implements Comparator<String> {
	/*
	 * onj1<obj2 ->1; obj1>obj2 ->-1; obj1==obj2 ->0;
	 *
	 * compare(2, 1) -> -1 compare(1, 2) -> 1 compare(1, 1) -> 0
	 */

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() > o2.length()) {
			return 1;
		} else if (o1.length() < o2.length()) {
			return -1;
		} else {
			return 0;
		}
	}

}
