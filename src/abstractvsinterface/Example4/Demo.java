package abstractvsinterface.Example4;

public class Demo {

	public static void main(String args[]) {
		// 4
		SimpleClass obj4 = new SimpleClass();
		obj4.display3();

		// 4
		AClass iObj4 = new AClass();
		iObj4.display1();
		iObj4.display3();
	}
}
