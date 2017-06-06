package workingwithobjects.hashcode;

public class HashExample {

	public static void main(String[] args) {
		
		FirstObject first = new FirstObject("One", 1);
		SecondObject second = new SecondObject("Two", 2);
		FirstObject third = first;
		FirstObject fourth = new FirstObject("One", 1);
		
		int firstHash = first.hashCode();
		int secondHash = second.hashCode();
		int thridHash = third.hashCode();
		int fourthHash = fourth.hashCode();
		System.out.println("first object's hash code is: " + firstHash);
		System.out.println("second object's hash code is: " + secondHash);
		System.out.println("third object's hash code is: " + thridHash);
		System.out.println("fourth object's hash code is: " + fourthHash);
	}
}
