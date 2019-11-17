package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {

	public static void main(String[] args) {
		
		//linked listai efektyvensi ilgiems sarasams!
		//linked listai - vienkrypciai ir dvikrypciai, vienkrypciai retai naudojami
		//panaudojimas - banko saskaitoms - daug iterpimo ir trynimo operaciju
		// node -idetine kase
		// prideti/istrinti elementa is priekio ar is galo - super efektyvu
		//linked list neturi default size - galima sukurti tik tuscia arba perduoti kolekcija
		//linked list'ai uzima daugiau vietos atmintyje
		
		
//		List<Integer> linkedList = new LinkedList<>();
//		linkedList.add(12);
//		linkedList.add(20);
//		System.out.println(linkedList);
//		linkedList.remove(0);
//		System.out.println(linkedList);
		
		List<Integer> arrayList = new ArrayList<>();
		List<Integer> linkedList = new LinkedList<>();
		fillListLinear(arrayList);
		measureTime(arrayList);
		System.out.println(arrayList.size());
		fillListLinear(linkedList);
		measureTime(linkedList);
		System.out.println(linkedList.size());
	
	}
	
	private static void measureTime(List<Integer> list) {
		long start = System.currentTimeMillis();
		
		//fillListLinear(list);
		//fillListIndex0(list);
		//fillListRandom(list);
		//removeListElementLinear(list);
		//removeFirstListElement(list);
		removeRandomListElement(list);
		
		long stop = System.currentTimeMillis();
		System.out.println("Time: "+ (stop-start)+"ms " + list.getClass());
	}
	
	private static void fillListLinear(List<Integer> list) {
		for (int i = 0; i < 100000; i++) {
			list.add(i);
		}
	}
	private static void fillListIndex0(List<Integer> list) {
		for (int i = 0; i < 100000; i++) {
			list.add(0, i);
		}
	}
	
	private static void fillListRandom(List<Integer> list) {
		list.add(0, 0);
		for (int i = 1; i < 100000; i++) {
			list.add((int) (Math.random()*list.size()+1), i);
			
		}
	}
	
	private static void removeListElementLinear(List<Integer> list) {
		for (int i = 0; i < 100000; i++) {
			list.remove(list.size()-1);
		}
	}
	private static void removeFirstListElement(List<Integer> list) {
		for (int i = 0; i < 100000; i++) {
			list.remove(0);
		}
	}
	
	private static void removeRandomListElement(List<Integer> list) {
		for (int i = 0; i < 100000; i++) {
			list.remove((int) (Math.random()*list.size()));
		}
	}

}
