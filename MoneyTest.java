package sibisoft;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class MoneyTest {
	
	@Test
	public void testMultiplication(){
		Money five = Money.dollor( 5 );
		assertEquals(Money.dollor(10), five.times( 2 ) );
		assertEquals( Money.dollor( 15 ), five.times( 3 ) );
	}
	
	@Test
	public void testFrancMultiplication(){
		Money five = Money.franc( 5 );
		assertEquals(Money.franc(10), five.times( 2 ) );
		assertEquals( Money.franc( 15 ), five.times( 3 ) );
	}
	
	@Test
	public void testEquality(){
		assertTrue( Money.dollor( 5 ).equals( Money.dollor( 5 ) ));
		assertFalse( Money.dollor( 5 ).equals( Money.dollor( 6 ) ));
		assertTrue( Money.franc( 5 ).equals( Money.franc( 5 ) ));
		assertFalse( Money.franc( 5 ).equals( Money.franc( 6 ) ));
		assertTrue( Money.franc( 5 ).equals( Money.dollor( 5 ) ));
	}
	
	@Test
	public void testCurrency(){
		assertEquals("USD", Money.dollor( 1 ).currency());
		assertEquals("CHF", Money.franc( 1 ).currency());
	}
	
	@Test
	public void testDifferentClassEquals(){
		assertTrue( new Money( 10, "CHF").equals( new Money( 10, "CHF" ) ) );
	}
	
}
