package abstractvsinterface.Example5;

//In abstract class, the keyword ‘abstract’ is mandatory to declare a method as an abstract

abstract class AbstractExample5 {
	public abstract void display1();
}

class AnotherClass extends AbstractExample5 {
	public void display1() {
		System.out.println("display1 method");
	}

	public void display2() {
		System.out.println("display2 method");
	}
}