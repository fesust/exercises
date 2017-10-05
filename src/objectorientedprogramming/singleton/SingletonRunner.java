package objectorientedprogramming.singleton;

public class SingletonRunner {
	
	public static void main(String[] args) {
		//The getInstance method is used also to provide a global point of access to the object and it can be used in the following manner:
		//Singleton.getInstance().doSomething();
		LazySingleton.getInstance().doSomething();
	}
}