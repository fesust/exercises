package inheritance;

public class InstanceOfExample {

    static boolean result;
    static HeavyVehicle heavyVehicle = new HeavyVehicle();
    static Truck truck = new Truck();
    static HeavyVehicle heavyVehicle2 = null;
    
    public static void main(String[] args) {
    	
        result = heavyVehicle instanceof HeavyVehicle;
        System.out.print("heavyVehicle is an HeavyVehicle: " + result + "\n");
        
        result = truck instanceof HeavyVehicle;
        System.out.print("truck is an HeavyVehicle: " + result + "\n");
        
        result = heavyVehicle instanceof Truck;
        System.out.print("heavyVehicle is a Truck: " + result + "\n");
        
        result = heavyVehicle2 instanceof HeavyVehicle;
        System.out.print("heavyVehicle2 is an HeavyVehicle: " + result + "\n");
        
        heavyVehicle = truck; //Sucessful Cast form child to parent
        truck = (Truck) heavyVehicle; //Sucessful Explicit Cast form parent to child
    }
    
}