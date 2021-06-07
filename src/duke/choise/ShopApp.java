package duke.choise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShopApp {

	public static void main(String[] args) {

		double total = 0;

		System.out.println("Welcome to Duke Choice Shop");
		Customer c1 = new Customer("Pinky", 3);
		System.out.println("Hello " +  c1.getName());

		System.out.println("The minimum price is " + Clothing.MINIMUM_PRICE);

		Clothing item1 =  new Clothing("Blue Jacket", 20.9, "M");
		Clothing item2 = new Clothing("Orange t-shirt", 10.5, "S");
		Clothing item3 = new Clothing("Green Scarf", 5, "S");
		Clothing item4 =  new Clothing("Blue T-shirt", 10.5, "S");
		Clothing[] items = {item1, item2, item3, item4};

		Arrays.sort(items);

		for (Clothing clothing: items) {
			System.out.println("The clothing " + clothing);
		}

		System.out.println("The size of the customer is " + c1.getSize());

		c1.setItems(items);
		c1.getTotalClothingCosts();

		double average = 0;

		try {
			average =  c1.getCustomerAveragePriceOfItemsWithSize("L");
			System.out.println("The average price is " + average);

		} catch (ArithmeticException e) {
			System.out.println("Could not calculate average price for customer's items.");
		}



	}
}
