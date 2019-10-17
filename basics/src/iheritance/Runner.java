package iheritance;

public class Runner {

	public static void main(String[] args) {
		Animals animal = new Animals("Harry");
		animal.sleep();
		animal.eat();
		
		Panda panda = new Panda("Peter",3);
		panda.sleep();
		panda.eat();
		panda.talk();
		System.out.println(panda.getName());
		System.out.println(panda.getAge());
		System.out.println(panda.toString());
		

	}

}
