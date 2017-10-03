package objectorientedprogramming.encapsulation;

public class ThightEncapsulation {
	
	private int age;
	
	public void setAge(int age) {
		if(age>130 || age < 1) {
			throw new IllegalArgumentException("Age can't be less than 1, or can't me be more than 130");
		}
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

}
