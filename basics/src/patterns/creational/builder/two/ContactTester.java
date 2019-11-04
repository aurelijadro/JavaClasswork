package patterns.creational.builder.two;

public class ContactTester {

	public static void main(String[] args) {
		Contacts contact = new Contacts ("Anna", "Lalala", "anna@anna.com", "+37060606060", "Some Address");
		System.out.println(contact);
		
		Contacts contact2 = new Contacts ("Toma", "+3705555555");
		System.out.println(contact2);

	}

}
