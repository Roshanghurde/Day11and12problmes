

package Day11_12problems;

public class Day11and12prblm_stock {

	String stockName;
	int sharePrice;
	int shareQuantity;
	double totalSharePrice;
	double accountBalance;

	public Day11and12prblm_stock(String stockName, int sharePrice, int shareQuantity, double totalSharePrice,
			int accountBalance) {
		this.accountBalance = accountBalance;
		this.stockName = stockName;
		this.sharePrice = sharePrice;
		this.shareQuantity = shareQuantity;
		this.totalSharePrice = totalSharePrice;

	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(int sharePrice) {
		this.sharePrice = sharePrice;
	}

	public int getShareQuantity() {
		return shareQuantity;
	}

	public void setShareQuantity(int shareQuantity) {
		this.shareQuantity = shareQuantity;
	}

	public double getTotalSharePrice() {
		return totalSharePrice;
	}

	public void setTotalSharePrice(int totalSharePrice) {
		this.totalSharePrice = totalSharePrice;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Day11and12prblm_stock() {

	}

	public Day11and12prblm_stock(String stockName, double sharePrice, int shareQuantity, double totalSharePrice,
			double remaningBalance) {

	}

	public String toString() {

		System.out.println("Holdings");
		return " \n StockName: " + stockName + "\n SharePrice: " + sharePrice + "\n Totalshares: " + shareQuantity
				+ "\n TotalsharePrice: " + totalSharePrice;
	}

}
