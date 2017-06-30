package abstractvsinterface.Example2;

//Interfaces can be extended only by interfaces. Classes has to implement them instead of extend

interface InterfaceExample2 {
	public void display1();
}

interface InterfaceTwo extends InterfaceExample2 {}

class ThisIsAClass implements InterfaceTwo {
	public void display1() {
		System.out.println("display1 method");
	}
}