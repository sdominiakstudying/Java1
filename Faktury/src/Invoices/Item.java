package Invoices;

public class Item {
	private String productName;
	private int quantity;
	private double priceNetto;
	private int vatTax;
	
	public Invoice parentInvoice;

	public Item(Invoice parentInvoice, String productName, int quantity, int priceNetto,
			int vatTax) {
		this.parentInvoice = parentInvoice;
		this.productName = productName;
		this.quantity = quantity;
		this.priceNetto = priceNetto;
		this.vatTax = vatTax;
	}
	
	public Item(String productName, int quantity, int priceNetto, int vatTax) {
		this(null, productName, quantity, priceNetto, vatTax);
	}

	
	
	
	public void setParentInvoice(Invoice parentInvoice) {
		this.parentInvoice = parentInvoice;
	}

	public void changeQuantity (int change)
	{
		quantity +=change;
	}
	
	
	public double getTotalPriceNetto()
	{
		return quantity * priceNetto;
	}
	
	public double getTotalPrice ()
	{
		return getTotalPriceNetto() * (vatTax + 100) / 100;
	}
	
	
	
	public String getProductName() {
		return productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getPriceNetto() {
		return priceNetto;
	}

	public int getVatTax() {
		return vatTax;
	}
	
	
	
}
