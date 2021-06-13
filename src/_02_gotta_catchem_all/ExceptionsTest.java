package _02_gotta_catchem_all;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExceptionsTest {
	ExceptionMethods em = new ExceptionMethods();

	// 1. This is an example of how one might test that an exception is thrown.
	// It tests that an IndexOutOfBoundsException is thrown
	@Test
	public void testIndexOOBException() {
		int[] vars = { 0, 1, 2, 3 };

		try {
			vars[0] = 4;
			assertArrayEquals(vars, new int[] { 4, 1, 2, 3 });
			vars[4] = 5;
			fail("IndexOutOfBoundsException not thrown");
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
			assertArrayEquals(vars, new int[] { 4, 1, 2, 3 });
		}
	}

	// 2. In the ExceptionMethods class, write a method called divide that takes
	// two doubles as parameters and returns their quotient as a double. This method
	// should throw an IllegalArgumentException if the denominator is 0.0.

	// 3. Complete the JUnit test method to test the divide method.
	@Test
	public void testDivideByZeroException() {
		double double1 = 0.0;
		double double2 = 2.0;
		try {
			em.divide(double1, double2);
			fail("IllegalArgumentException not thrown");
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}

	}

	// 4. In the ExceptionMethods class, write a method called reverseString that
	// takes a
	// String and returns the reverse of that String. It should throw an
	// IllegalStateException
	// if the String passed in is empty

	// 5. Complete the JUnit test method to test the reverseStringMethod.
	@Test
	public void testReverseString() {
		String test1 = "sock";
		String test2 = "car";
		String test3 = "";
		try {
			em.reverseString(test1);
			assertEquals("kcos", em.reverseString(test1));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		try {
			em.reverseString(test2);
			assertEquals("rac", em.reverseString(test2));
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
		try {
			em.reverseString(test3);
			fail("IllegalStateException not thrown");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		}
	}

}
