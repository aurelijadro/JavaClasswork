package comparator;

import java.util.Comparator;

public class JavaIntegerComporator implements Comparator<Integer> {

	// returns ints from largest to smallest!

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o2 > o1) {
			return 1;
		} else if (o2 < o1) {
			return -1;
		} else {
			return 0;
		}
	}

}
