package objectorientedprogramming.coupling;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	public static void main(String[] args) {
        List<BillItem> itemList = new ArrayList<>();
        itemList.add(new BillItem("Drink", 300));
        itemList.add(new BillItem("Snacks", 400));

        Bill bill = new Bill(itemList);
        Account account = new Account();
        Card card = new Card(account);
        card.payBill(bill);
        
        /*
        Application app = new Application();

        List<BillItem> itemList = new ArrayList<>();
        itemList.add(new BillItem("Drink", 300));
        itemList.add(new BillItem("Snacks", 400));
        
        Bill bill = new Bill(itemList);
        Account acc = new Account();
        acc.getCard().payBill(bill);
		*/
    }

}