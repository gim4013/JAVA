
public class Human implements Valuable {
	private String name;
	private int age;
	public Human(String name,int age) {
		this.name = name;
		this.age= age;
	}
	@Override
	public double EstimateValue(int month) {
		
		return Double.POSITIVE_INFINITY;
	}
	@Override
	public String toString()
	{
		return String.format("Human name:%s\n regitstred age: %d",name,age);
		
		
	}
}
