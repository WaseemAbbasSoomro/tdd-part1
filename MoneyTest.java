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
	
	//@Test
	/*public void testFrancMultiplication(){
		Money five = Money.franc( 5 );
		assertEquals(Money.franc(10), five.times( 2 ) );
		assertEquals( Money.franc( 15 ), five.times( 3 ) );
	}*/
	
	@Test
	public void testEquality(){
		assertTrue( Money.dollor( 5 ).equals( Money.dollor( 5 ) ));
		assertFalse( Money.dollor( 5 ).equals( Money.dollor( 6 ) ));
		//assertTrue( Money.franc( 5 ).equals( Money.dollor( 5 ) ));
	}
	
	@Test
	public void testCurrency(){
		assertEquals("USD", Money.dollor( 1 ).currency());
		assertEquals("CHF", Money.franc( 1 ).currency());
	}
	
	@Test
	public void testSimpleAddition(){
		//Money addition = Money.dollor( 5 ).plus( Money.dollor( 5 ) );
		Money five = Money.dollor( 5 );
		Expression addition = five.plus( five );
		Bank bank = new Bank();
		Money reduced = bank.reduce( addition, "USD" );
		assertEquals( Money.dollor( 10 ), reduced);
	}
	
	@Test
	public void testPlusReturnSum(){
		Money five = Money.dollor( 5 );
		Expression result = five.plus( five );
		Sum sum = (Sum) result;
		assertEquals( five, sum.augend );
		assertEquals( five,sum.addend );
	}
	
}
