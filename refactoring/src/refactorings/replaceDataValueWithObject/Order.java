package refactorings.replaceDataValueWithObject;

import java.util.List;

public class Order {
    private Customer _customer;

    public Order (String customerName) {
        _customer = new Customer(customerName);
    }
    public String getCustomerName() {
        return _customer.getName();
    }
    public void setCustomer(String arg) {
        _customer.setName(arg);
    }
	public static int numberOfOrdersFor(List<Order> orders, String customer) {
		int result = 0;
		for (Order order : orders) {
			if (order.getCustomerName().equals(customer))
				result++;
		}
		return result;
	}
}
