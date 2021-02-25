package bookshop.processes;

import bookshop.model.Order;
import bookshop.model.OrderItem;
import bookshop.model.Product;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.fail;

public class OrderCalculator_Unit_Test
{
	private static final Product THE_2EUR_BOOK = new Product("The EUR 2 book", "2.0");
	private static final Product THE_50CT_BOOK = new Product("The 50ct book", "0.33");
	private static final Product THE_33CT_BOOK = new Product("The 0.33ct book", "0.33");

	private final OrderCalculator orderCalculator = new OrderCalculator();

	private String total;

	@Test
	public void calcTotalSingleItem()
	{
		Order order = new Order();
		order.addItem(new OrderItem(THE_2EUR_BOOK, 1));

		whenTotalCaculated(order);

		assertThat(total, is("2"));
	}

	private void whenTotalCaculated(Order order)
	{
		total = orderCalculator.getTotalFor(order);
	}

	@Test
	public void calcTotalTwoItemsEachOneOfIt()
	{
		Order order = new Order();
		order.addItem(new OrderItem(THE_50CT_BOOK, 1));
		order.addItem(new OrderItem(THE_33CT_BOOK, 1));

		String total = orderCalculator.getTotalFor(order);

		assertThat(total, is("0.88"));
	}

	@Test
	public void calcTotalTwoItems()
	{
		Order order = new Order();
		order.addItem(new OrderItem(THE_50CT_BOOK, 1));
		order.addItem(new OrderItem(THE_33CT_BOOK, 2));

		String total = orderCalculator.getTotalFor(order);

		assertThat(total, is("1.16"));
	}

	@Test
	public void calcTotalOfBigOrderWithFiveItems()
	{
		fail("Not implemented, yet.");
	}
}
