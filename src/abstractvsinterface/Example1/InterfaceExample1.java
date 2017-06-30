package abstractvsinterface.Example1;

//interface can extend any number of interfaces at a time

//first interface
interface InterfaceExample1 {
	public void display1();
}

// second interface
interface SecondInterface {
	public void display2();
}

// This interface is extending both the above interfaces
interface ThirdInterface extends InterfaceExample1, SecondInterface {
}

class AndAClass implements ThirdInterface {
	public void display1() {
		System.out.println("display2 method");
	}

	public void display2() {
		System.out.println("display3 method");
	}
}