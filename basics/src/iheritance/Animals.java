package iheritance;

public class Animals {
	private String name;
	
	public Animals(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Animals [name=" + name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void sleep() {
		System.out.println("Zzzzz ZZzzzz Zzzzz");
	}
	public void eat() {
		System.out.println("Om niom niom");
	}
}
