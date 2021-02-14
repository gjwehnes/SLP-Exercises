package ex010;

public class StoreProduct {

	public String label;
	public int price;
	public String category;
	public boolean hasExpiration;
	public int stock;

	public StoreProduct(String label, int price, String category, boolean hasExpiration, int stock) {
		this.label = label;
		this.price = price;
		this.category = category;
		this.hasExpiration = hasExpiration;
		this.stock = stock;
	}

	public StoreProduct(String label, int price, int stock) {
		this.label = label;
		this.price = price;
		this.category = "misc";
		this.hasExpiration = false;
		this.stock = stock;
	}

	public StoreProduct(String label, int price) {
		this.label = label;
		this.price = price;
		this.category = "misc";
		this.hasExpiration = false;
		this.stock = 0;
	}

	public StoreProduct(String label, int price, String category, boolean hasExpiration) {
		this.label = label;
		this.price = price;
		this.category = category;
		this.hasExpiration = hasExpiration;
		this.stock = 0;
	}

	public void setExpired(boolean hasExpired) {
		if (this.hasExpiration && hasExpired ) {
			this.stock = 0;
		}
	}

	public boolean makeSale(int quantity) {
		if (this.stock >= quantity) {
			this.stock -= quantity;
			return true;
		}
		else {
			return false;
		}
	}

	public double getDiscountedPrice(double discount) {
		// TODO Auto-generated method stub
		return this.price * (1 - discount);
	}

}
