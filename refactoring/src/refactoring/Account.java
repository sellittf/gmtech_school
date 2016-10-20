package refactoring;

import java.util.Date;
import java.util.Enumeration;
import java.util.Vector;

public class Account {
	private Vector _entries = new Vector();

	double getFlowBetween(DateRange range) {
		double result = 0;
		Enumeration e = _entries.elements();
		while (e.hasMoreElements()) {
			Entry each = (Entry) e.nextElement();
			if (range.includes(each.getDate())) {
				result += each.getValue();
			}
		}
		return result;
	}
	
	int gamma (int inputVal, int quantity, int yearToDate) {
		int importantValue1 = (inputVal * quantity) + delta();
		int importantValue2 = (inputVal * yearToDate) + 100;
		if ((yearToDate - importantValue1) > 100)
		importantValue2 -= 20;
		int importantValue3 = importantValue2 * 7;
		// and so on.
		return importantValue3 - 2 * importantValue1;
	}	
}
