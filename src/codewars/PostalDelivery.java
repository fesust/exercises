package codewars;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PostalDelivery {
	/**
	 * The Post office needs two weekdays to deliver a package after the order. Calculate the delivery date based on the input
	 * Monday, Tuesday, Wednesday, Sunday -> +2 | Thursday, Friday: +4 | Saturday: +3
	 * @param orderDate
	 * @return the delivery date in yyyy MMM dd format
	 */
	public static String deliveryDate(Calendar orderDate) {
		int dayoforder = orderDate.get(Calendar.DAY_OF_WEEK);
				
		if (dayoforder <= 4 ){
			orderDate.add(Calendar.DAY_OF_MONTH, 2);
		}
		else if (dayoforder == 5 || dayoforder == 6){
			orderDate.add(Calendar.DAY_OF_MONTH, 4);
		}
		else {
			orderDate.add(Calendar.DAY_OF_MONTH, 3);
		}
		
		DateFormat df = new SimpleDateFormat("yyyy MMM dd");
		String formattedDate = df.format(orderDate.getTime());
		
		return formattedDate;
		
		
	}
	
	public static void main(String[] args) {
		Calendar orderDate = Calendar.getInstance(); 
		orderDate.set(2017, 5, 5);
		System.out.println(deliveryDate(orderDate)); //2017.06.07
		orderDate.set(Calendar.DAY_OF_MONTH, 9);
		System.out.println(deliveryDate(orderDate));//2017.06.13
		orderDate.set(Calendar.DAY_OF_MONTH, 10);
		System.out.println(deliveryDate(orderDate));//2017.06.13
		orderDate.set(Calendar.DAY_OF_MONTH, 11);
		System.out.println(deliveryDate(orderDate));//2017.06.13
	}

}


/**
* Solution:
* int today = orderDate.get(Calendar.DAY_OF_WEEK);
* if(today < 5)
* 	orderDate.add(Calendar.DATE, 2);
* else if (today > 4 && today < 7)
* 	orderDate.add(Calendar.DATE, 4);
* else if(today == 7)
* 	orderDate.add(Calendar.DATE, 3);
* return new SimpleDateFormat("yyyy MMM dd").format(orderDate.getTime());
*/