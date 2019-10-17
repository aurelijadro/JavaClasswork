package op2;

import iheritance.Animals;
import iheritance.Panda;

public class Admin2 {

	public static void main(String[] args) {
		Animal2 animal = new Animal2("Harry");
	
		
		Panda2 panda = new Panda2("Peter",3, "black");
		Racoon racoon = new Racoon("Racoon");
		panda.eat();
		racoon.eat();
		
		Panda2 anotherPanda = new Panda2("Rob",2, "white");
		int legs = Panda2.LEGS_NUMBER;
		int legs2 = anotherPanda.LEGS_NUMBER;
		
		Greg pandaGreg = new Greg("Greg", 1, "lilac");
		Greg pandaGregGreg = new Greg ("Steve", 2, "grey");
		pandaGreg.eat();
		
		
	}

}
