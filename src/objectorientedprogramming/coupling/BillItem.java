package objectorientedprogramming.coupling;

public class BillItem {
	
	private String name;
    private double cost;

    public BillItem(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
    
}