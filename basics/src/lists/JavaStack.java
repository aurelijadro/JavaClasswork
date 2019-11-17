package lists;

import java.util.Stack;

public class JavaStack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>(); // LIFO last in first out
		stack.push(5);
		stack.push(2);
		stack.push(15);
		stack.push(1);

		System.out.println(stack);
		System.out.println(stack.pop()); // išima paskutini elementą
		System.out.println(stack);
		System.out.println(stack.peek()); // pasižiūri paskutinį elementą

	}

}
