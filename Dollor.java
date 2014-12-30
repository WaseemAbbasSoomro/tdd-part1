/**
 * 
 */
package sibisoft;

/**
 * @author Waseem Abbas
 *
 */
public class Dollor extends Money{

	private String currency;
	
	public Dollor( int amount, String currency ){
		this.amount = amount;
		this.currency = currency;
	}
	
	public Money times( int multiplier ){
		return Money.dollor( amount * multiplier );
	}

	public String currency() {
		// TODO Auto-generated method stub
		return this.currency;
	}
	
}
