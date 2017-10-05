package objectorientedprogramming.factorymethodexample;

public abstract class Factory {
	
	public void doSomething() {
		Product product = factoryMethod();
	}
	
	protected abstract Product factoryMethod();
	
}