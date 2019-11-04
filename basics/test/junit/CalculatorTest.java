package junit; // framework'as leidziantis testuoti koda

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	//should
	@Test
	public void shouldCountSum() { // client requirements!!!
		Calculator calc = new Calculator();
		assertEquals(4.0, calc.countSum(2.0, 2.0), 0.0);
	}

}
