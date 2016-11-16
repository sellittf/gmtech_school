package refactorings.changeBidirectionalAssociationToUnidirectional;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    private Set _orders = new HashSet();

    void addOrder(Order arg) {
    	_orders.add(arg);
    }

	public boolean containsOrder(Order order) {
		return _orders.contains(order);
	}

	public int getDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
