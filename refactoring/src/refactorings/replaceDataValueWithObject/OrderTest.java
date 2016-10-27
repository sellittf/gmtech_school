package refactorings.replaceDataValueWithObject;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class OrderTest {
	@Test
	public void testName() {
		List<Order> orders = new ArrayList<Order>();
		orders.add(new Order("marco"));
		orders.add(new Order("marco"));
		orders.add(new Order("giulia"));
		assertEquals(2, Order.numberOfOrdersFor(orders, "marco"));
	}
}
