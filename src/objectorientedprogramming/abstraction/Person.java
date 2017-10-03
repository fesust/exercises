package objectorientedprogramming.abstraction;

abstract class Person {
	protected String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void printName();
	
}

/*Casting
float f = 5.5f;
int i = 1;
int j = (int) (i+f);
float k = i+f;
System.out.println(j);
System.out.println(k);

**Converting
double d = 25.5;
String s = String.valueOf(d);
System.out.println(s);
*/