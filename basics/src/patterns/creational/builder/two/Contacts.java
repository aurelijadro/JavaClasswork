package patterns.creational.builder.two;

public class Contacts {

	private String name;
	private String surname;
	private String email;
	private String phone;
	private String address;
	
	public Contacts(String name, String surname, String email, String phone, String address) {
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", surname=" + surname + ", email=" + email + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	public Contacts(String name, String phone) {
	
		this.name = name;
		this.phone = phone;
	}
	
	
	
	
	
}
