package Invoices;

import java.util.ArrayList;

public class Invoice {
	
	private static int totalInvoices = 0;
	final private int INVOICENUMBER;
	
	final private String COMPANYNAME;

	public Invoice(String imprint) {
		this.INVOICENUMBER = ++totalInvoices;
		COMPANYNAME = imprint;
		
	}
	
	ArrayList<Item> productList = new ArrayList<Item>();
	
	
	public Invoice AddProduct (Item product)
	{
		this.productList.add(product);
		
		return this;
	}
	
	
	
}
