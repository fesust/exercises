package objectorientedprogramming.inheritance;

public class Bicycle {
        
    private int gears;
	private int wheels;
	private int speed;

	public Bicycle(int wheels, int speed, int gears) {
    	gears = this.gears;
        wheels = this.wheels;
        speed = this.speed;
    }
        
    public void setWheels(int newValue) {
        wheels = newValue;
    }
        
    public void setGear(int newValue) {
        gears = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
}
