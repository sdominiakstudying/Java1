package cars;

public class Car {
	
	private String brand;
	private boolean used;
	private int mileage;
	private double price;
	
	// If the car is used
	
	public Car (String brand, int mileage, double price)
	{
		
		this.brand = brand;
		this.used = true;
		this.mileage = mileage;
		this.price = price;
		
	}
	
	// If the car is new
	
	public Car (String brand, double price)
	{
		
		this.brand = brand;
		this.used = false;
		this.mileage = 0;
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
			this.mileage += mileageChange;
			this.used = true;
		}
	}
	
	// Price change, they're not paid to be given out
	
	public void ChangePrice (double priceChange)
	{
		if (price + priceChange > 0)
		{
			price += priceChange;
		}
	}
	
	
	
	
	public String GetBrand()
	{
		return brand;
	}
	
	public boolean GetIfUsed()
	{
		return used;
	}
	
	public int GetMileage()
	{
		return mileage;
	}
	
	public double GetPrice()
	{
		return price;
	}
	
	
}
