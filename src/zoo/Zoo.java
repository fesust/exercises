package zoo;

import animals.Animal;

public class Zoo {

	public static void main(String[] args) {

		
		Animal [] zooanimals;
		zooanimals = new Animal[12];
		zooanimals[0] = new Animal("wolf", "Wolfie", "female", 12, "Carnivore", "grey");
		zooanimals[1] = new Animal("elephant", "Manny", "male", 25, "Herbivore", "grey");
		zooanimals[2] = new Animal("wolf", "Winston", "male", 15, "Carnivore", "grey");
		zooanimals[3] = new Animal("elephant", "Dumbo", "female", 45, "Herbivore", "grey");
		zooanimals[4] = new Animal("lion", "Simba", "male", 10, "Carnivore", "brown");
		zooanimals[5] = new Animal("lion", "Nala", "female", 8, "Carnivore", "brown");
		zooanimals[6] = new Animal("kangaroo", "Joey", "male", 5, "Herbivore", "brown");
		zooanimals[7] = new Animal("kangaroo", "Gracie", "female", 3, "Herbivore", "brown");
		zooanimals[8] = new Animal("giraffe", "Geoffrey ", "male", 30, "Herbivore", "brown");
		zooanimals[9] = new Animal("giraffe", "April", "female", 24, "Herbivore", "brown");
		zooanimals[10] = new Animal("fox", "Mulder", "male", 7, "Carnivore", "red");
		zooanimals[11] = new Animal("fox", "Eevee", "female", 9, "Carnivore", "red");
		/*
		int total = getTotalAge(zooanimals);
		System.out.println("Total age of animals: " + total);
		double avg = getAverageAge(zooanimals, total);
		System.out.println("Average age of animals: " + avg);
		System.out.println("The number of female animals: " + females(zooanimals));
		getTheOldest(zooanimals);
		getTheYoungest(zooanimals);
		System.out.println("The number of carnivores: " + numOfCarni(zooanimals));
		*/
		printGrayAnimals(zooanimals);
		countSpecies(zooanimals);
	}
	
	public static int getTotalAge(Animal [] animals) {
		int total = 0;
		for(int i = 0; i < animals.length; i++) {
			total += animals[i].getAge();
		}
		return total;
	}
	
	public static double getAverageAge(Animal [] animals, int total) {
		double avg = 0;
		avg = total / (double)Animal.number;
		return avg;
	}

	public static int females(Animal [] ladies) {
		int ladyCounter = 0;
		for (int i = 0; i < ladies.length; i++) {
			if (ladies[i].getGender().equals("female")) {
				ladyCounter ++;
				System.out.println("The female animal's name is: " + ladies[i].getName() + ", species: " + ladies[i].getSpecies());
			}
				
		}
		return ladyCounter;
	}

	public static void getTheOldest(Animal [] oldest) {
		int index = 0 ;
		int age = 0 ;
		for (int i = 0; i < oldest.length; i++) {
			if (oldest[i].getAge()>age) {
				index = i;
				age = oldest[i].getAge();
			}
				
		}
		System.out.println("The oldest animal is: " + oldest[index].getName() + ", " + oldest[index].getSpecies() + ", " + oldest[index].getAge());
	}
	
	public static void getTheYoungest(Animal [] youngest) {
		int index = 0 ;
		int age = 9000 ;
		for (int i = 0; i < youngest.length; i++) {
			if (youngest[i].getAge()<age) {
				index = i;
				age = youngest[i].getAge();
			}
		}
		System.out.println("The youngest animal is: " + youngest[index].getName() + ", " + youngest[index].getSpecies() + ", " + youngest[index].getAge());
	}
	
	public static int numOfCarni (Animal[] carnis){
		int numOfCarnis=0;
		for (int i=0; i < carnis.length; i++) {
			if (carnis[i].getFeedingType().equals("Carnivore")){
				numOfCarnis++;
			}
		}
		return numOfCarnis;
	}
	
	public static void printGrayAnimals(Animal[] grays){
		for (int i=0; i < grays.length; i++) {
			if (grays[i].getColor().equals("grey")){
				System.out.println("Grey animal is: " + grays[i].getName() + ", " + grays[i].getSpecies());
			}
		}
	}
	
	public static void countSpecies(Animal[] animals) {
		int wolfCounter=0, elephantCounter=0;
		for (int i=0; i < animals.length; i++) {
			String species = animals[i].getSpecies();
			switch (species) {
			case "wolf":
				wolfCounter++;
				break;
			case "elephant":
				elephantCounter++;
				break;
			default:
				break;
			}
		}
		System.out.println("Number of wolves: " + wolfCounter);
		System.out.println("Number of elephants: " + elephantCounter);
	}
}