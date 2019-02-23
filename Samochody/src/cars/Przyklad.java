package cars;

public class Przyklad {
	
	public static void main(String[] args)
	{
		Car car = new Car("BMW", 10000, 20000);
		
		car.ChangePrice(-230.5);
		
		System.out.print(car.ShowPrice());
		
	}
	
	
}
