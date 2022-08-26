package entities;

public class CurrencyConverter {
	private Double dollar_price;
	private Double amount2buy;
	private static double IOF = 0.06;
	
	public Double value2Pay() {
		if(this.getDollar_price() != null && this.getAmount2buy() != null) {
			return (this.getDollar_price() * this.amount2buy) * (1 + IOF);
		} else {
			System.out.println("I cannot convert.");
			return null;
		}
	}
	
	private Double getDollar_price() {
		return this.dollar_price;
	}
	public void setDollar_price(Double dollar_price) {
		this.dollar_price = dollar_price;
	}
	private Double getAmount2buy() {
		return this.amount2buy;
	}
	public void setAmount2buy(Double amount2buy) {
		this.amount2buy = amount2buy;
	}
	
	
}
