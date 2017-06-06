package workingwithobjects.enumexample;

public class ColorTester {
	
	public static void main(String[] args) {
		Color color = Color.GREEN;
		
		switch(color) {
		case BLUE:
			System.out.println("Blue");
			break;
		case RED:
			System.out.println("Red");
			break;
		case GREEN:
			System.out.println("Green");
			break;
		default:
			System.err.println("Wrong color");
			break;
		}
		/*	
		for (Color c : Color.values()) {
			int code = c.getColorCode();
			System.out.println("Current color is: " + c.toString() + ", code is: " + code);
		}
		*/
	}
}
