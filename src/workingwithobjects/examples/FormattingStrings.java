package workingwithobjects.examples;

public class FormattingStrings {

	
	public static void main(String[] args) {
		float floatVar = 12.54f;
		int intVar = 22;
		String stringVar = "Hello";
		System.out.printf("The value of the float " + "variable is %f, while " + "the value of the " + "integer variable is %d, " + 
				"and the string is %s" + ".", floatVar, intVar, stringVar);
		
		System.out.println("");
		
		String formatString = "The result of averaging %1$d" + " %2$d and %3$d is %4$.2f";
		System.out.printf(formatString, 12, 4, 6, ((12+4+6)/3.0));
	}
	
}
