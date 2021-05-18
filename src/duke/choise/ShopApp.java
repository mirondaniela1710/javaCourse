package duke.choise;

public class ShopApp {

	public static void main(String[] args) {

		double total = 0;
		int measurement = 3;

		System.out.println("Welcome to Duke Choice Shop");
		Customer c1 = new Customer();
		c1.setName("Pinky");
		c1.setSize("S");
		System.out.println("Hello " +  c1.getName());

		Clothing item1 =  new Clothing();
		Clothing item2 = new Clothing();
		Clothing item3 = new Clothing();
		Clothing item4 =  new Clothing();
		Clothing[] items = {item1, item2, item3, item4};

		item1.setDescription("Blue Jacket");
		item1.setPrice(20.9);
		item1.setSize("M");

		item2.setDescription("Orange t-shirt");
		item2.setPrice(10.5);
		item2.setSize("S");

		item3.setDescription("Green Scarf");
		item3.setPrice(5);
		item3.setSize("S");

		item4.setDescription("Blue T-shirt");
		item4.setPrice(10.5);
		item4.setSize("S");

		c1.setSize(measurement);
		System.out.println("The size of the customer is " + c1.getSize());

		c1.setItems(items);
		c1.getTotalClothingCosts();
	}
}
