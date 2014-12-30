package sibisoft;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MoneyTest {
	
	@Test
	public void testMultiplication(){
		Dollor five = new Dollor( 5 );
		Dollor product = five.times( 2 );
		assertEquals(10, product.amount );
		product = five.times( 3 );
		assertEquals( 15, product.amount );
	}
	
}
