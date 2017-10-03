package objectorientedprogramming.inheritance;

public class MountainBike extends Bicycle {
	
	 public int seatHeight;

	 public MountainBike(int seatHeight, int wheels, int speed, int gears) {
		 super(wheels, speed, gears);
		 seatHeight = this.seatHeight;
	 }   
	        
	 public void setHeight(int newValue) {
		 seatHeight = newValue;
	 }   

}
