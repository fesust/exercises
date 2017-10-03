package objectorientedprogramming.coupling;

import java.util.List;

public class Bill {
	
	private List<BillItem> items;

    public Bill(List<BillItem> itemList) {
        this.items = itemList;
    }

    public List<BillItem> getItems() {
        return items;
    }

    public double getTotal() {
        double sum = 0;
        for (BillItem e : items) {
            sum += e.getCost();
        }
        return sum;
    }
    
    /*
	private List<BillItem> items;

    public Bill(List<BillItem> itemList) {
        this.items = itemList;
    }

    public List<BillItem> getItems() {
        return items;
    }
    */
}