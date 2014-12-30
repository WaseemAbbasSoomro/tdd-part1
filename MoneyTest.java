package sibisoft;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoneyTest {
	
	@Test
	public void testMultiplication(){
		Dollor five = new Dollor( 5 );
		five.times(2);
		assertEquals(10, five.amount );
		five.times( 3 );
		assertEquals( 15, five.amount );
	}
	
}
