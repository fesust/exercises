package junit;

import junit.framework.TestCase;

public class TestFixtures extends TestCase{
	
	private int v1, v2;
	
	protected void setUp() {
		v1 = 5;
		v2 = 4;
	}
	
	public void testNumbers() {
		int result = v1 - v2;
		assertTrue( result > 0);
	}
	
	public void test2() {
		int result = v1 + v2;
		assertEquals(9, result);
	}
	
	protected void tearDown() {
		v1 = 0;
		v2 = 0;
	}

}
