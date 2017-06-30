package abstractvsinterface.Example3;

//Abstract class can have both abstract and concrete methods

abstract class AbstractExample3 {
	abstract void display1();

	public void display2() {
		System.out.println("display2 method");
	}
}

class AClass extends AbstractExample3 {
	public void display1() {
		System.out.println("display1 method");
	}
}