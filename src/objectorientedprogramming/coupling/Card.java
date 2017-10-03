package objectorientedprogramming.coupling;

public class Card {
	
	private Account account;

    public Card(Account account) {
        this.account = account;
    }

    public void payBill(Bill bill) {
        account.payBill(bill.getTotal());
    }
   
    /*
    private Account account;

    public Card(Account account) {
        this.account = account;
    }
    
    public void payBill(Bill bill) {
        account.payBill(bill);
    }
	*/
}