package bookshop.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Order
{
	private List<OrderItem> items = new ArrayList<>();

	public Order()
	{
	}

	public void addItem(OrderItem item)
	{
		this.items.add(item);
	}

	public List<OrderItem> getItems()
	{
		return this.items;
	}
}
