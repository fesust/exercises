package junit.testsuites;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestOne {

	String text = "Text";
	
	@Test
	public void testText() {
		assertEquals("Text", text);
	}
}
