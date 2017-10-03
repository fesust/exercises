package objectorientedprogramming.polymorphism;

/**
 * This example shows Static Polymorphism
 * @author Tamas_Fesuss
 *
 */
public class Overloading {
	
	
	public void print(String s) {
		System.out.println("Only string: " + s);
	}
	
	public void print(int i) {
		System.out.println("Only int: " + i);
	}
	
	public void print(String s, int i) {
		System.out.println("String and int: " + s + ", " + i);
	}
}
