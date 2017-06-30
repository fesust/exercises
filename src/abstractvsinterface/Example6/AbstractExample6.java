package abstractvsinterface.Example6;

//Abstract class can have protected , public and public abstract methods

abstract class AbstractExample6 {
	protected abstract void display1();

	public abstract void display2();

	public abstract void display3();
}

class AnotherClass extends AbstractExample6 {
	public void display1() {
		System.out.println("display1 method");
	}

	public void display2() {
		System.out.println("display2 method");
	}

	public void display3() {
		System.out.println("display3 method");
	}
}