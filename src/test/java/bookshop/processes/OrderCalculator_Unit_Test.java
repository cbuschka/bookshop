package bookshop.processes;

import bookshop.model.Order;
import bookshop.model.OrderItem;
import bookshop.model.Product;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OrderCalculator_Unit_Test
{
	private OrderCalculator orderCalculator = new OrderCalculator();

	@Test
	public void calcTotalSingleItem()
	{
		Product product = new Product("The 50ct book", "2.0");

		Order order = new Order();
		order.addItem(new OrderItem(product, 1));
		String total = orderCalculator.getTotalFor(order);

		assertThat(total, is("2"));
	}

	@Test
	public void calcTotalTwoItems()
	{
		Product product = new Product("The 50ct book", "0.33");
		Product product2 = new Product("The 0.33ct book", "0.33");

		Order order = new Order();
		order.addItem(new OrderItem(product, 1));
		order.addItem(new OrderItem(product2, 2));
		String total = orderCalculator.getTotalFor(order);

		assertThat(total, is("0.99"));
	}
}