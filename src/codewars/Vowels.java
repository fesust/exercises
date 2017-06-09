package codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vowels {
	/**
	 * Return the number (count) of vowels in the given string.
	 * @param str accepts: a, e, i, o, u, A, E, I, O, U
	 * @return the number of vowels in the string
	 */
	
	public static int getCount(String str) {
	    int vowelsCount = 0;
	    String regex = "[aeiouAEUIO]";
	    Pattern p = Pattern.compile(regex);
	    Matcher m = p.matcher(str);
	    while(m.find()) vowelsCount++;  
	    return vowelsCount;
	  }

	public static void main(String[] args) {
		System.out.println(getCount("abracadabra")); //5
		System.out.println(getCount("This is a bit longer string with spaces, and special characters too, like comma or point.")); //26
		System.out.println(getCount("")); //0
	}

}









/**
* Solution:
* String regex = "[aeiouAEUIO]";
* Pattern p = Pattern.compile(regex);
* Matcher m = p.matcher(str);
* while(m.find()) vowelsCount++;
*/
