package sibisoft;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MoneyTest {
	
	@Test
	public void testMultiplication(){
		Dollor five = new Dollor( 5 );
		assertEquals(new Dollor(10), five.times( 2 ) );
		assertEquals( new Dollor( 15 ), five.times( 3 ) );
	}
	
	@Test
	public void testEquality(){
		assertTrue(new Dollor( 5 ).equals( new Dollor( 5 )));
		assertTrue(new Dollor( 5 ).equals( new Dollor( 6 )));
	}
	
}
