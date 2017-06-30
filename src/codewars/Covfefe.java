package codewars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Your are given a string. You must replace the word(s) coverage by covfefe,
 * however, if you don't find the word coverage in the string, you must add
 * covfefe at the end of the string with a leading space.
 */

public class Covfefe {

	public static String covfefe(String tweet) {
		String regex = "coverage*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(tweet);
		if(m.find()) {
			tweet = tweet.replaceAll("coverage", "covfefe");
		}
		else {
			tweet = tweet.concat(" covfefe");
			
		}
		return tweet;
	}

	public static void main(String[] args) {
		System.out.println(covfefe("coverage")); // covfefe
		System.out.println(covfefe("coverage coverage")); //covfefe covfefe
		System.out.println(covfefe("nothing")); // nothing covfefe
		System.out.println(covfefe("double space ")); // double space  covfefe
		System.out.println(covfefe("covfefe")); // covfefe covfefe
	}
}