package java_static;

public class People {
	private String name; // API
	private int age;
	static String description = "Stupid people";
	static int peopleCounter = 0; // visiems peoplams pasiekiama reiksme, skaiciuoja visus sukurtus.
// visi objektai turi ta pati kintamaji su ta pacia reiksme

	public People(String name, int age) {
		this.name = name;
		this.age = age;
		peopleCounter++;
	}

	static void talk() { // static metodui leidzia ji iskviesti nesukurus objekto
		System.out.println("Olla, chikita!");
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
