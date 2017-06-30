package abstractvsinterface.Example2;

//Abstract class can be inherited by a class or an abstract class

class AbstractExample2 {
	public void display1() {
		System.out.println("display1 method");
	}
}

abstract class AbsClass {
	public void display2() {
		System.out.println("display2 method");
	}
}

abstract class AbsClass2 extends AbsClass {
	abstract void display3();
}

class SecondClass extends AbsClass2 {
	public void display2() {
		System.out.println("Example4-display2 method");
	}

	public void display3() {
		System.out.println("display3 method");
	}
}