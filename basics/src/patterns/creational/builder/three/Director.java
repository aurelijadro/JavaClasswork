package patterns.creational.builder.three;

/// builder'is leidzia nekurti milijono konstruktoriu

public class Director {

	public static void main(String[] args) {
		
		Contact contactOne = new Contact(new ContactBuilder().name("Laura").phone("+37055555555"));
		System.out.println(contactOne);
		Contact contactTwo = new ContactBuilder().name("Laura").build();
		System.out.println(contactTwo);
		
		Contact contactThree = new ContactBuilder()
				.name("Anna").phone("+37088888888")
				.email("anna@anna.com")
				.build();
		
		System.out.println(contactThree);
	}

}
