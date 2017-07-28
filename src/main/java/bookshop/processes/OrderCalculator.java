package bookshop.processes;

import bookshop.model.Order;
import bookshop.model.OrderItem;

import java.math.BigDecimal;

public class OrderCalculator
{
	public String getTotalFor(Order order)
	{
		BigDecimal total = BigDecimal.ZERO;
		if (order.getItems().size() > 0)
		{
			total = addOrderItem(total, order.getItems().get(0));
		}
		if (order.getItems().size() > 1)
		{
			total = addOrderItem(total, order.getItems().get(1));
		}
		if (order.getItems().size() > 2)
		{
			total = addOrderItem(total, order.getItems().get(2));
		}
		if (order.getItems().size() > 3)
		{
			throw new UnsupportedOperationException("Cannot process order with more than 4 items.");
		}


		return total.toString();
	}

	private BigDecimal addOrderItem(BigDecimal total, OrderItem item)
	{
		total = total.add(new BigDecimal(item.getProduct().getPrice()));
		return total;
	}
}
