package workingwithobjects.examples;

public class IsStringImmutable {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = s1;
		
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = "Help";
		System.out.println(s1);
		System.out.println(s2);
		
		s1 = s1.replace('e', 'a');
		System.out.println(s1);
		System.out.println(s2);
	}
}
