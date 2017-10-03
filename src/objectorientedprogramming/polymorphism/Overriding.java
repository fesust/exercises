package objectorientedprogramming.polymorphism;
/**
 * This example shows Dynamic Polymorphism
 * @author Tamas_Fesus
 *
 */
class Overriding {

	public static void main(String[] args) {
		Mobile m = new Mobile("Nokia", "Windows", "Lumia 930", 1);
		System.out.println(m.getModel());
		Android a = new Android("Huawei", "Android", "P10 Plus", 226380);
		System.out.println(a.getModel());
	}
}

class Mobile {
	
	private String manufacturer;
	private String opSys;
	protected String model;
	private int price;
	
	Mobile(String manufacturer, String opSys, String model, int price){
		this.manufacturer = manufacturer;
		this.opSys = opSys;
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}
	
}

class Android extends Mobile {

	Android(String manufacturer, String opSys, String model, int price) {
		super(manufacturer, opSys, model, price);
	}
	
	public String getModel() {
		return model;
	}
	
}