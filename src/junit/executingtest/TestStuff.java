package junit.executingtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStuff {

	String message = "Hello World";	
	MessageUtil messageUtil = new MessageUtil(message);

	@Test
	public void testPrintMessage() {
		assertEquals(message, messageUtil.printMessage());
	}
}
