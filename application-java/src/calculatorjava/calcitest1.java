package calculatorjava;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class calcitest1 {

	@Test
	public void calTest() {
		assertEquals(31, calculatorjava.add(11, 20));
	}

	@Test
	public void calTestSub() {
		assertEquals(30, calculatorjava.sub(50, 20));
	}

	@Test
	public void calcTestMul() {
		assertEquals(30, calculatorjava.mul(6, 5));
	}

	@Test
	public void calcTestDiv() {
		assertEquals(5, calculatorjava.div(30, 5));
	}

}