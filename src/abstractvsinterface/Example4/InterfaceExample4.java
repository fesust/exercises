package abstractvsinterface.Example4;

//A class can implement any number of interfaces at a time

interface InterfaceExample4 {
	public void display1();
}

interface SecondInterface {
	public void display2();
}

class AClass implements InterfaceExample4, SecondInterface {
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