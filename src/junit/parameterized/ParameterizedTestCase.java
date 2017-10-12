package junit.parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTestCase {
	
	private int numberA;
    private int numberB;
    private int expected;
	
	public ParameterizedTestCase(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
	}
	
	@Parameterized.Parameters
	public static Collection<Object[]> testData() {
		Object[][] data = new Object[][] {
			 {1, 1, 2},
             {2, 2, 4},
             {8, 2, 10},
             {4, 5, 9},
             {5, 5, 9}
		};
		return Arrays.asList(data);
	}
	
	@Test
	public void test() {
		assertEquals("Adding numberB to numberA should match expected", expected, MathAdd.add(numberA, numberB));
	}
	
}
