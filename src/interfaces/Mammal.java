package interfaces;

public class Mammal implements Human {

	@Override
	public void speak() {
		System.out.println("Human speaks");
	}

	public void eat() {
		System.out.println("Mammal eats");
	}

	public void travel() {
		System.out.println("Mammal travels");
	}

	public int noOfLegs(int num) {
		return num;
	}

	public static void main(String[] args) {
		Mammal m = new Mammal();
		System.out.println("New Mammal");
		m.eat();
		m.travel();
		System.out.println("Number of legs: " + m.noOfLegs(4));
		Human h = new Mammal();
		System.out.println("New Human");
		System.out.println("Number of legs: " + h.noOfLegs(2));
		h.speak();

	}

}
