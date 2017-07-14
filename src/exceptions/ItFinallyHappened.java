package exceptions;

public class ItFinallyHappened {
	
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException  {
		int[] a = new int[2];
		try {
			System.out.println("Value of third element: " + a[3]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown: " + e);
		}
		finally {
			a[0] = 6;
			a[1] = 8;
			int result = a[0] + a[1];
			System.out.println("Adding first element to second equals with: " + result);
		}
	}
}
