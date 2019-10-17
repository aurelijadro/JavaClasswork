package iheritance;

public class Panda extends Animals { // panda paveldi klases animals savybes. private savybiu ir metodu nepaveldi
	
	private int age;
	
	public Panda(String name, int age) {
		super(name); // eik pas teva, tevas viska zinos
		this.age=age;
		
	}

	@Override
	public void eat() { 
		System.out.println("Om niom niom, Panda happy!");
	}
	
	public void talk() {
		System.out.println("Panda Panda Panda");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Panda [age=" + age + ", name=" + getName() + "]";
	}
	
}
