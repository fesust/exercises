package junit.timeout;

import org.junit.Test;

public class SimpleTimeOut {

	@Test(timeout = 1000)
	public void infinity() {
		while (true) ;
	}

	@Test(timeout = 5000)
	public void testSlowMethod() {
		long z = 0;
		for(int a = 0; a < 10000; a++) {
			for(int b = 0; b < 10000; b++) {
				for(int c = 0; c < 1000; c++) {
					z += a;
				}
			}
		}
		System.out.println(z);
	}

}
