package objectorientedprogramming.singleton;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton() {
		//do the constructor stuff here privately
	}
	
	/* The getInstance method ensures that only one instance of the class is created. 
	 * The constructor should not be accessible from the outside of the class to ensure the only way of instantiating the class would be only through the getInstance method.
	 */
	public static synchronized Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
	
	public void doSomething() {
		//do some other stuff
	}
}