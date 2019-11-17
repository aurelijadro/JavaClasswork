package generics;

import java.util.ArrayList;
import java.util.List;

// java 5 - atsirado generic'ai, kurie leidzia dirbti su skirtingais tipais unifikavimas
public class JavaGenericsTest {
	public static void main(String[] args) {
		BoxOne box1 = new BoxOne(1);
		System.out.println(box1);
		BoxTwo box2 = new BoxTwo("1");
		System.out.println(box2);

		Box<Double> box3 = new Box<>(3.14);
		System.out.println(box3);
		Box<BoxOne> box4 = new Box<>(box1);
		System.out.println(box4);

		// iki Java5 neaisku, ka galima sudeti i sarasa! Del to atsirado generic'ai:
		List numbers = new ArrayList();
		numbers.add("1");
		numbers.add(1);
		numbers.add('1');

		// nuo JAVA5:

		List<Integer> numbers2 = new ArrayList<Integer>();
		// numbers.add("1"); -> kompiliatorius neleidzia prideti
		numbers2.add(1);
		// numbers.add('1'); -> kompiliatorius neleidzia prideti

		// nuo Java7:
		List<Integer> numbers3 = new ArrayList<>();
		numbers3.add(1);

	}
}
