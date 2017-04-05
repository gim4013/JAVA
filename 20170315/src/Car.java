
public class Car implements Valuable{
	private String name;
	private double price;
	public Car(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
	@Override
	public double EstimateValue(int month) {
		this.price =price*0.8;
		price=price*Math.pow(0.99,month);
		return price;
	}
	@Override
	public String toString()
	{
		return String.format("Car name:%s\n initial price: %f",name,price);
		
		
	}

}
