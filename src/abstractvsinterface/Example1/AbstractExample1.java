package abstractvsinterface.Example1;

//abstract class can extend only one class or one abstract class at a time

class AbstractExample1 {
	public void display1() {
		System.out.println("display1 method");
	}
}

abstract class AbstractClass {
	public void display2() {
		System.out.println("display2 method");
	}
}

abstract class AnotherAbstractClass extends AbstractExample1 {
	abstract void display3();
}

class AnotherClass extends AbstractClass {
	public void display3() {
		System.out.println("display3 method");
	}
}