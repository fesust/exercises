package abstractvsinterface.Example7;

//Interface can have only static final (constant) variable i.e. by default

interface InterfaceExample7 {
	int numOne = 10;
}

class AClass implements InterfaceExample7 {
	public void display1() {
		System.out.println("Num1=" + numOne);
	}
}