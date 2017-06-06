package workingwithobjects.examples;

public class StringBuild {

	
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World!");
		String ssb = sb.toString();
		System.out.println(sb);
		System.out.println(ssb);
	}
}
