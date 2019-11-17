package map;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester { //set saugo tik unikalius elementus - arraylist'a sukišam į setą ir gaunam visus unikalius elementus

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> linkedSet = new LinkedHashSet<>();
		Set<Integer> treeSet = new TreeSet<>();
		
		fillSet(hashSet);
		System.out.println(hashSet);
		fillSet(linkedSet);
		System.out.println(linkedSet);
		fillSet(treeSet);
		System.out.println(treeSet);
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		//Union
		Set<Integer> union = new HashSet<>(set1); //apjungia dvi aibes ir grazina tik unikalius elementus
		union.addAll(set2);
		System.out.println(union);
		
		//Intersection
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		
		//Difference
		Set<Integer> difference = new HashSet<>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
		
	}
	
	private static void fillSet(Set<Integer> set) {
		set.add(1);
		set.add(15);
		set.add(7);
		set.add(3);
	}

}
