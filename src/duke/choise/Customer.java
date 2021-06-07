package duke.choise;

public class Customer {

	private String name;
	private String size;
	private Clothing[] items;

	public Customer () {
	}

	public Customer(String name, int measurement) {
		this.name = name;
		setSize(measurement);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setSize(int size) {
		switch (size) {
			case 1, 2, 3:
				setSize("S");
				break;
			case 4, 5, 6:
				setSize("M");
				break;
			case 7, 8, 9:
				setSize("L");
				break;
			default:
				setSize("X");
				break;
		}
	}

	public Clothing[] getItems() {
		return this.items;
	}

	public void setItems(Clothing[] items) {
		this.items = items;
	}

	public double getTotalClothingCosts() {
		double total = 0;
		for (Clothing item: this.items) {
			if (item.getSize().equalsIgnoreCase(this.getSize())) {
				System.out.println("Item is a " + item.getDescription() + ", size " + item.getSize() + " and price " + item.getPrice());
				total =  total + item.getPrice();
			}
			if (total > 15) {
				break;
			}
		}

		System.out.println("The total with tax is " + total);
		return total;
	}

	public double getCustomerAveragePriceOfItemsWithSize(String size) {

		double totalPrice = 0;
		int counterClothing = 0;

		for(Clothing clothing : this.getItems()) {
			if (clothing.getSize().equals(size)) {
				totalPrice = totalPrice + clothing.getPrice();
				counterClothing ++;
			}
		}

		//Having double values, division by zero returns Infinity, which is similar to NaN (not a number).
		//here the problem is that NaN is not considered an exception
		if (counterClothing == 0) {
			throw new ArithmeticException();
		} else {
			return totalPrice;
		}

	}


}
