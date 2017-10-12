package junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestJUnit {
	
	@Test
	public void testString() {
		String str = "Tast";
		assertEquals("Test", str);
	}

}
