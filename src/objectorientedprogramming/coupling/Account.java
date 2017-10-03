package objectorientedprogramming.coupling;

public class Account {
	
	public Account() {
    
	}

    public void payBill(double cost) {
        System.out.println("Total cost: " + cost);
    }
    
    /*
    private Card card;

    public Account() {
        this.card = new Card(this);
    }

    public void payBill(Bill bill) {
        double sum = 0;
        for (BillItem e : bill.getItems()) {
            sum += e.getCost();
        }

        System.out.println("Total cost: " + sum);
    }

    public Card getCard() {
        return card;
    }
    */

}