package abstractvsinterface.Example3;

//Interface can only have abstract methods, they cannot have concrete methods

interface InterfaceExample3 {
	public abstract void display1();
}

class ThisIsAClass implements InterfaceExample3 {
	public void display1() {
		System.out.println("display1 method");
	}
}