package abstractvsinterface.Example7;

//Abstract class can have static, final or static final variables with any access specifier

abstract class AbstractExample7 {
	
	private int numOne = 10;
	protected final int numTwo = 20;
	public static final int numThree = 500;

	public void display1() {
		System.out.println("Num1=" + numOne);
	}
}

class AnotherClass extends AbstractExample7 {
	public void display2() {
		System.out.println("Num2=" + numTwo);
		System.out.println("Num2=" + numThree);
	}
}