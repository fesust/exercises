package junit.testsuites;

import static org.junit.Assert.assertNull;

import org.junit.Test;

public class TestTwo {

	String text = null;
	
	@Test
	public void testText() {
		assertNull(text);
	}
}
