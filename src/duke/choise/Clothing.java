package duke.choise;

public class Clothing {
	private String description;
	private double price;
	private String size = "M";
	static final double MINIMUM_PRICE = 10;
	static final double TAX = 0.2;

	public Clothing() {
	}

	public Clothing(String description, double price, String size) {
		this.description = description;
		this.price = price;
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return (TAX + 1) * price;
	}

	public void setPrice(double price) {
		if (price < 10) {
			this.price = MINIMUM_PRICE;
		} else {
			this.price = price;
		}
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Override
	public String toString() {
			return "Item is a " +  this.getDescription() + ", size " + this.getSize() + " and price " + this.getPrice();
	}
}
