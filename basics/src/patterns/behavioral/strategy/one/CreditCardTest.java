package patterns.behavioral.strategy.one;

public class CreditCardTest {
	public static void main(String[] args) {
		CreditCard master = new CreditCard(new MasterCardStrategy());
		master.setNumber("5123456");
		System.out.println("MasterCard validation: " + master.isValid());
	}
}
