package sibisoft;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;
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
	
	@Test
	public void testEquality(){
		assertTrue(new Dollor( 5 ).equals( new Dollor( 5 )));
		assertTrue(new Dollor( 5 ).equals( new Dollor( 6 )));
	}
	
}
