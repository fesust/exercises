package objectorientedprogramming.factorymethodexample;

public class ConcreteFactory extends Factory {
	
	protected Product factoryMethod() {
		return new ConcreteProduct();
	}

}