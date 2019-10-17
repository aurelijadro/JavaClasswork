package abstraction;

public abstract class Animal { // is abstract klases negalima kurti objektu
	//abstract - kuriame ideja/brezini
	
	public String name;
	public long id;
	
	public void sleep() {
		System.out.println("Zzz Zzz Zzz");
	}
	
	public void eat() {
		System.out.println(("Om niom niom, food is good"));
	}
	
	
	
	public Animal(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}

	public abstract void makeSound(); // abstraktus metodas -nera realizuotas

}
