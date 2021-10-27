package Abstraction;
import org.junit.Test;

import junit.framework.TestCase;
public class BmwFlyingCar extends TestCase {
	@Test
	public void testAdd() {
		int expected = 40;
		int actual = BmwFlyingCar.add(10,20);
		assertEquals(expected, actual);
	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}


