package bookshop.model;

public class OrderItem
{
	private static int count;

	private Product product;

	public OrderItem(Product product, int count)
	{
		this.product = product;
		this.count = count;
	}

	public int getCount()
	{
		return count;
	}

	public void setCount(int count)
	{
		this.count = count;
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}

	@Override
	public boolean equals(Object obj)
	{
		OrderItem other = (OrderItem) obj;
		return other.product.equals(this.product)
				&& other.count == this.count;
	}

	@Override
	public int hashCode()
	{
		return this.count;
	}
}
