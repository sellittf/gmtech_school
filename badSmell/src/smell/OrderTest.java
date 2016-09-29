package smell;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {

	private Order _order;
	
	@Before
	public void setUp() throws Exception {
		_order = new Order();
	}

	@Test
	public void initialOrderisEmpty() {
		assertThat(_order.getLineItems().size(), is(0));		
	}
	
	@Test
	public void appendLineItemsToOrder() {
		LineItem lineItem1 = new LineItem(12, 321, 4, 10);
		LineItem lineItem2 = new LineItem(124, 322, 2, 12);
		_order.addLineItem(lineItem1);
		_order.addLineItem(lineItem2);
		
		assertThat(_order.getLineItems().contains(lineItem1), is(true));
		assertThat(_order.getLineItems().contains(lineItem2), is(true));
	}

	@Test
	public void getTotalOverLineItems() throws FileNotFoundException {
		LineItem lineItem1 = new LineItem(12, 321, 4, 10);
		LineItem lineItem2 = new LineItem(124, 322, 2, 12);
		_order.addLineItem(lineItem1);
		_order.addLineItem(lineItem2);
		
		assertThat(_order.getTotal(), is(64));
	}
	
}
