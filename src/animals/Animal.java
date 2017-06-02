package animals;

public class Animal {

	String species;
	String name;
	String gender;
	int age;
	String feedingType;
	String color;
	public static int number=0;
	
	public Animal(String species, String name, String gender, int age, String feedingType, String color) {
		this.species = species;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.feedingType = feedingType;
		this.color = color;
		number++;
	}

	public String getSpecies() {
		return species;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getFeedingType() {
		return feedingType;
	}

	public String getColor() {
		return color;
	}
}