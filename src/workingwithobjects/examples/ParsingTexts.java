package workingwithobjects.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ParsingTexts {

	public static void main(String[] args) {
		
		StringTokenizer st = new StringTokenizer("This is a test");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("");
		
		File file = new File("myNumbers.txt");
		
		try {
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				System.out.println(line);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			System.err.println("File not found!");
		}
		
	
	}
}
