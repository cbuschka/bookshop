package bookshop.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Order
{
	private Set<OrderItem> items = new HashSet<>();

	public Order()
	{
	}

	public void addItem(OrderItem item)
	{
		Set<OrderItem> newItems = new HashSet<>();
		newItems.addAll(this.items);
		newItems.add(item);
		this.items = newItems;
	}

	public List<OrderItem> getItems()
	{
		return new ArrayList<>(this.items);
	}
}
