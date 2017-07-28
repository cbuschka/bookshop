package bookshop.model;

public class Product
{
	private String name;

	private float price;

	public Product(String name, String price)
	{
		this.name = name;
		this.price = new Float(price);
	}

	public String getName()
	{
		return name;
	}

	public float getPrice()
	{
		return price;
	}
}
