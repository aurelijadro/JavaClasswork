package patterns.behavioral.iterator.one;

public class Test {

	public static void main(String[] args) {
		String[] skills = {"Java", "JavaScipt", "HTML", "PHP", "CSS", "Drink Cofee"};
		JavaDeveloper developer = new JavaDeveloper("Anna", skills);
		Iterator iterator = developer.getIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
