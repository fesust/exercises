package abstractvsinterface.Example4;

//A class can extend only one abstract class at a time

abstract class AbstractExample4 {
	public void display1() {
		System.out.println("display1 method");
	}
}

abstract class AnotherClass {
	abstract void display2();
}

class SimpleClass extends AbstractExample4 {
	public void display3() {
		System.out.println("display3 method");
	}
}