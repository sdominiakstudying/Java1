package cars;

public class Car {
	
	private String brand;
	private boolean used;
	private int mileage;
	private double price;
	
	
	public Car (String brand, boolean used, int mileage, double price)
	{
		
		this.brand = brand;
		this.used = used;
		this.mileage = mileage;
		this.price = price;
		
	}
	
	// No setting brand
	
	// Car can become used, no other way 'round
	public void setUsed ()
	{
		used = false;
	}
	
	// Mileage change, only upwards
	
	public void UpdateMileage(int mileageChange)
	{
		if (mileageChange > 0)
		{
			mileage += mileageChange;
		}
	}
	
	// Price change, they're not paid to be given out
	
	public void PriceChange (double priceChange)
	{
		if (price + priceChange > 0)
		{
			price += priceChange;
		}
	}
	
	
	
	
	public String ShowBrand()
	{
		return brand;
	}
	
	public boolean ShowIfUsed()
	{
		return used;
	}
	
	public int ShowMileage()
	{
		return mileage;
	}
	
	public double ShowPrice()
	{
		return price;
	}
	
	
}
