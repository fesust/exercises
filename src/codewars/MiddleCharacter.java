package codewars;

public class MiddleCharacter {
	
	/**
	 * #Input
	 * A word (string) of length 0 < word < 1000
	 * #Output
	 * The middle character(s) of the word represented as a string.
	 */
	public static String getMiddle(String word) {
		String result= "";
		int strlng = word.length();
		if (strlng < 1 || strlng > 999)
		{
			System.err.println("out of range");
			return result;
		}
		int half = strlng / 2;
		if (strlng % 2 == 0)
		{
			result = word.substring(half-1,half+1);
		}
		else 
		{
			result = word.substring(half, half+1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getMiddle("")); //should throw error
		System.out.println(getMiddle("A")); //A
		System.out.println(getMiddle("xy")); //xy
		System.out.println(getMiddle("Abc")); //b
		System.out.println(getMiddle("test")); //es
		System.out.println(getMiddle("middle")); //dd
		System.out.println(getMiddle("testing")); //t
		
	}
}






/**
* Solution:
* int length = word.length();
* int half = length/2;
* if(length < 1 || length > 1000) {
* 	System.err.print("Length error");
* 	return result;
* }
* if (length % 2 == 0) { 
* 	result = word.substring(half - 1, half + 1);
* }
* else {
* 	result = word.substring(half, half + 1);
* }
*/