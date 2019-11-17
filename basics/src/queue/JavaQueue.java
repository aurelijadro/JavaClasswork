package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class JavaQueue {
	public static void main(String[] args) {
		People unit1 = new People(111);
		People unit2 = new People(222);
		People unit3 = new People(333);
		People unit4 = new People(444);
		People unit5 = new People(555);
		Queue<People> people = new LinkedList<>(); // FIFO
		people.add(unit3);
		people.add(unit1);
		people.add(unit2);
		people.add(unit4);
		System.out.println(people);
		for (People unit : people) {
			System.out.println(unit + " ");
		}
		System.out.println();

		Queue<People> newPeople = new ArrayBlockingQueue<>(4); // FIFO with constrained capacity
//		newPeople.add(unit5);
//		newPeople.add(unit3);
//		newPeople.add(unit1);
//		newPeople.add(unit4);
//		newPeople.add(unit4); //queue full exception!

		// offer vietoj klaidos(exception) grazina false
		System.out.println(newPeople.offer(unit5)); // true
		System.out.println(newPeople.offer(unit4)); // true
		System.out.println(newPeople.offer(unit3)); // true
		System.out.println(newPeople.offer(unit1)); // true
		System.out.println(newPeople.offer(unit2)); // false
		System.out.println(newPeople);

//		newPeople.remove();
//		System.out.println(newPeople);
//		newPeople.remove();
//		System.out.println(newPeople);
//		newPeople.remove();
//		System.out.println(newPeople);
//		newPeople.remove();
//		System.out.println(newPeople);
//		//newPeople.remove(); // no such element exception!

		System.out.println(newPeople.poll());
		System.out.println(newPeople);
		newPeople.poll();
		System.out.println(newPeople);
		newPeople.poll();
		System.out.println(newPeople);
		newPeople.poll();
		System.out.println(newPeople);
		newPeople.poll(); // kai nieko nelieka grazina null!
		System.out.println(newPeople);
	}
}
