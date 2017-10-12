package junit;

import org.junit.*;

public class Annotations {
	
	@After
	public void after() {
		System.out.println("After annotation used");
	}
	
	@Test
	public void test1() {
		System.out.println("Test1: Test annotation used");
	}
	
	@Before
	public void before() {
		System.out.println("Before annotation used");
	}
	
	@Ignore
	public void ignored() {
		System.out.println("Nothing is happening here");
	}
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BeforeClass annotation used");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("AfterClass annotation used");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2: Test annotation used");
	}
	
}
