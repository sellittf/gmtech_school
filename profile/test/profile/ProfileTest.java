package profile;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class ProfileTest {

	@Test
	public void sumTo() {
		assertThat(new Profile().sumTo(100), is(5050));
	}
	
	@Test
	public void accumulate() {
		assertThat(new Calc().accumulate(5, 2), is(7));
	}
}
