package objectorientedprogramming.factorymethodexample;

public class Client {
	
	public static void main(String[] args) {
		Factory factory = new ConcreteFactory();
		factory.doSomething();
	}
}
