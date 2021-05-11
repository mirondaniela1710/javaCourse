package duke.choise;

public class ShopApp {

	public static void main(String[] args) {

		double tax = 0.2;
		double total;

		System.out.println("Welcome to Duke Choice Shop");
		Customer c1 = new Customer();
		c1.name = "Pinky";
		System.out.println("Hello " +  c1.name);

		Clothing item1 =  new Clothing();
		Clothing item2 = new Clothing();

		item1.description = "Blue Jacket";
		item1.price = 20.9;
		item1.size = "M";

		item2.description = "Orange t-shirt";
		item2.price = 10.5;
		item2.size = "S";

		System.out.println("Item 1 is a " + item1.description + ", size " + item1.size + " and price " + item1.price);
		System.out.println("Item 2 is a " + item2.description + ", size " + item2.size + " and price " + item2.price);

		total = (2 * item2.price + item1.price) * tax  +  2 * item2.price + item1.price;
		System.out.println("The total is " + total);


	}
}
