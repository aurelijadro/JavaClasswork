package op2;


public class Panda2 extends Animal2 { // panda paveldi klases animals savybes. private savybiu ir metodu nepaveldi
	
	private int age;
	private String color;
	private static int pandaCounter;
	private double weight;
	public static final int LEGS_NUMBER = 4; //konstanta visoms pandoms
	
	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Panda2(String name, int age, String color) {
		super(name); // eik pas teva, tevas viska zinos
		this.age=age;
		this.color=color;
		pandaCounter++;
		
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