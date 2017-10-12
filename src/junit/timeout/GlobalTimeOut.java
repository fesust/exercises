package junit.timeout;

import java.util.concurrent.TimeUnit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GlobalTimeOut {
	
	//global timeout rule
    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);
    
    @Test
    public void testSlowMethod1() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5000);
    }
    
    @Test
    public void testSlowMethod2() {
        System.out.println("Passed");
    }
}
