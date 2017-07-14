package exceptions;

public class DivideZero {

	public static void main(String[] args) {
		int div = 0;
		int num = 100;
		int[] numArray = new int[1];
		try {
			int result = num / div;
			System.out.println("The result is: " + result);
			numArray[3] = 5;
		}
		
		//This is code duplication, and since Java7 the below catch block is usable to avoid it.
		/*
		catch(ArithmeticException ex) {
			System.out.println("Exception: " +ex.getMessage());
			ex.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Exception: " +ex.getMessage());
			ex.printStackTrace();
		}
		*/		
		catch(ArithmeticException|ArrayIndexOutOfBoundsException ex) {
		
		}
	}
}
