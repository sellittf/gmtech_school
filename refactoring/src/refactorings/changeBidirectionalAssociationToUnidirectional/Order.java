package refactorings.changeBidirectionalAssociationToUnidirectional;

import java.util.Iterator;

public class Order {
    Customer getCustomer() {
        Iterator iter = Customer.getInstances().iterator();
        while (iter.hasNext()) {
            Customer each = (Customer)iter.next();
            if (each.containsOrder(this)) return each;
        }
        return null;
    }

    double getDiscountedPrice(Customer _customer) {
    	return getGrossPrice() * (1 - _customer.getDiscount());
    }

	private int getGrossPrice() {
		// TODO Auto-generated method stub
		return 0;
	}    
}
