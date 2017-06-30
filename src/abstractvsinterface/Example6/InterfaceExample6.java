package abstractvsinterface.Example6;

//Interface can have only public abstract methods i.e. by default

interface InterfaceExample6 {
	void display1();
}

class AClass implements InterfaceExample6 {
	public void display1() {
		System.out.println("display1 method");
	}

	public void display2() {
		System.out.println("display2 method");
	}
}