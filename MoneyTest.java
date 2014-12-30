package sibisoft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MoneyTest {
	
	@Test
	public void testMultiplication(){
		Dollor five = new Dollor( 5 );
		assertEquals(new Dollor(10), five.times( 2 ) );
		assertEquals( new Dollor( 15 ), five.times( 3 ) );
	}
	
	@Test
	public void testFrancMultiplication(){
		Franc five = new Franc( 5 );
		assertEquals(new Franc(10), five.times( 2 ) );
		assertEquals( new Franc( 15 ), five.times( 3 ) );
	}
	
	@Test
	public void testEquality(){
		assertTrue( new Dollor( 5 ).equals( new Dollor( 5 ) ));
		assertFalse( new Dollor( 5 ).equals( new Dollor( 6 ) ));
		assertTrue( new Franc( 5 ).equals( new Franc( 5 ) ));
		assertFalse( new Franc( 5 ).equals( new Franc( 6 ) ));
		assertTrue( new Franc( 5 ).equals( new Dollor( 6 ) ));
	}
	
}
