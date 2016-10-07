package refactoring;

import static org.junit.Assert.assertEquals;
import static refactoring.Lines._;

import org.junit.Test;

public class RentalTest {

	@Test
	public void empty() {
		Customer c = new Customer("pluto");

		assertEquals(_("Rental Record for pluto").add("Amount owed is 0.0")
				.add("You earned 0 frequent renter points").toString(),
				c.statement());
	}

	@Test
	public void rent_some_movies_for_a_few_days() {
		Customer c = new Customer("pluto");
		c.addRental(new Rental(new Movie("KPax"), 10));
		c.addRental(new Rental(new Movie("L.A. Confidential"), 15));
		c.addRental(new Rental(new NewReleaseMovie("Rocky XXIV"), 3));
		c.addRental(new Rental(new ChildrensMovie("Madagascar"), 7));

		assertEquals(
				_("Rental Record for pluto")
					.indent("KPax	14.0")
					.indent("L.A. Confidential	21.5")
					.indent("Rocky XXIV	9.0")
					.indent("Madagascar	7.5")
					.add("Amount owed is 52.0")
					.add("You earned 5 frequent renter points").toString(),
				c.statement());
	}
}