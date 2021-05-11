package duke.choise;

public class ShopApp {

	public static void main(String[] args) {

		double tax = 0.2;
		double total = 0;
		int measurement = 3;

		System.out.println("Welcome to Duke Choice Shop");
		Customer c1 = new Customer();
		c1.name = "Pinky";
		c1.size = "S";
		System.out.println("Hello " +  c1.name);

		Clothing item1 =  new Clothing();
		Clothing item2 = new Clothing();
		Clothing item3 = new Clothing();
		Clothing item4 =  new Clothing();
		Clothing[] items = {item1, item2, item3, item4};

		item1.description = "Blue Jacket";
		item1.price = 20.9;
		item1.size = "M";

		item2.description = "Orange t-shirt";
		item2.price = 10.5;
		item2.size = "S";

		item3.description = "Green Scarf";
		item3.price = 5;
		item3.size = "S";

		item4.description = "Blue T-shirt";
		item4.price = 10.5;
		item4.size = "S";

//		System.out.println("Item 1 is a " + item1.description + ", size " + item1.size + " and price " + item1.price);
//		System.out.println("Item 2 is a " + item2.description + ", size " + item2.size + " and price " + item2.price);
//		total = (2 * item2.price + item1.price) * tax  +  2 * item2.price + item1.price;

		switch (measurement) {
			case 1, 2, 3:
				c1.size = "S";
				break;
			case 4, 5, 6:
				c1.size = "M";
				break;
			case 7, 8, 9:
				c1.size = "L";
				break;
			default:
				c1.size = "X";
				break;
		}

		System.out.println("The size of the customer is " + c1.size);

		for (Clothing item: items) {
			if (item.size.equalsIgnoreCase(c1.size)) {
				System.out.println("Item is a " + item.description + ", size " + item.size + " and price " + item.price);
				total =  total + item.price;
			}
			if (total > 15) {
				break;
			}
		}

		System.out.println("The total without tax is " + total);
		total = total * tax + total;
		System.out.println("The total with tax is " + total);


	}
}
