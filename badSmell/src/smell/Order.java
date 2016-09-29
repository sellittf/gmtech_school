package smell;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Vector;

public class Order {

	private Vector<LineItem> lineItemList = new Vector<LineItem>();

	public Order() {
	}

    void addLineItem(LineItem lineItem) {
		lineItemList.add(lineItem);
	}
 
    Vector<LineItem> getLineItems() {
        return lineItemList;
    }
	
	public boolean equals(Object aThat) {
		if (this == aThat)
			return true;
		if (!(aThat instanceof Order))
			return false;
		Order that = (Order) aThat;
		return this.lineItemList.equals(that.lineItemList);
	}

	public void writeToPrintWriter(PrintWriter pw) {
		Iterator<LineItem> iter = lineItemList.iterator();
		LineItem item;

		while (iter.hasNext()) {
			item = (LineItem)iter.next();

			pw.println("Begin Line Item");
			pw.println("Product = " + item.getProductID());
			pw.println("Image = " + item.getImageID());
			pw.println("Quantity = " + item.getQuantity());
			pw.println("Total = " + item.getTotalPrice());
			pw.println("End Line Item");
		}
		pw.println("Order total = " + getTotal());
	}

	public int getTotal() {
        Iterator<LineItem> iter = lineItemList.iterator();
        LineItem item;

        int total = 0;
        while (iter.hasNext()) {
            item = (LineItem)iter.next();
            total += item.getTotalPrice();
        }
        return total;
	}

	/** This method saves the order to the database */
	public void saveOrder() throws SQLException {
		String sql = new StringBuffer().append("INSERT INTO T_ORDER ")
				.append("(AUTHORIZATION_CODE, ")
				.append("SHIPMETHOD_ID, USER_ID, ADDRESS_ID) ")
				.append("VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")
				.toString();

		Connection conn = setConnection();
		PreparedStatement orderStatement = conn.prepareStatement(sql);
		// set all parameters

		orderStatement.executeUpdate();
	}

	private Connection setConnection() {
		return null;
	}
}
