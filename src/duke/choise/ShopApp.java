package duke.choise;

public class ShopApp {

	public static void main(String[] args) {

		double total = 0;
		//int measurement = 3;

		System.out.println("Welcome to Duke Choice Shop");
		Customer c1 = new Customer("Pinky", 3);
		System.out.println("Hello " +  c1.getName());

		Clothing item1 =  new Clothing("Blue Jacket", 20.9, "M");
		Clothing item2 = new Clothing("Orange t-shirt", 10.5, "S");
		Clothing item3 = new Clothing("Green Scarf", 5, "S");
		Clothing item4 =  new Clothing("Blue T-shirt", 10.5, "S");
		Clothing[] items = {item1, item2, item3, item4};

		System.out.println("The size of the customer is " + c1.getSize());

		c1.setItems(items);
		c1.getTotalClothingCosts();
	}
}
