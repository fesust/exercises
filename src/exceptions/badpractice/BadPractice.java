package exceptions.badpractice;

public class BadPractice {
	
	public static void main(String[] args) {
		ClassLoader cl;
		try {
			cl = Thread.currentThread().getContextClassLoader();
		} catch(Throwable ex) { //don't do this
			ex.printStackTrace();  //or this
		}
	}
}
