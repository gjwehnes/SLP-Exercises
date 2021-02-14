package ex011;

public class Stock {

	String tickerSymbol;
	String companyName;
	double price;
	double percentChange;
	int totalShares;
	double marketCap;
	
	public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
		this.tickerSymbol = tickerSymbol.toUpperCase();
		this.companyName = companyName;
		this.price = price;
		this.totalShares = totalShares;
		this.percentChange = 0;
		this.marketCap = this.price * this.totalShares;
	}

	public void adjustPrice(double i) {
		this.percentChange = (i / this.price) * 100;
		this.price += i;
		this.marketCap = this.price * this.totalShares;
	}
	
	
}
