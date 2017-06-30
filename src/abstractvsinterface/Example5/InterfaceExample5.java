package abstractvsinterface.Example5;

//In interfaces, the keyword ‘abstract’ is optional to declare a method as an abstract because all the methods are abstract by default

interface InterFaceExample5 {
	public void display1();
}

class AClass implements InterFaceExample5 {
	public void display1() {
		System.out.println("display1 method");
	}

	public void display2() {
		System.out.println("display2 method");
	}
}