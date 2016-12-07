package refactorings.introduceLocalExtension;

import java.util.Date;

public class ExtendedDate extends Date {

	public Date nextDay() {
		return new Date(getYear(), getMonth(), getDate() + 1);
	}

}
