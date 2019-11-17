package comparator;

import java.util.Comparator;

public class JavaDeveloperComparator implements Comparator<Developer> {

	@Override
	public int compare(Developer o1, Developer o2) {
		if (o1.getCodeLines() < o2.getCodeLines()) {
			return 1;
		} else if (o1.getCodeLines() > o2.getCodeLines()) {
			return -1;
		} else {
			return 0;
		}
	}

}
