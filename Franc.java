package sibisoft;

/**
 * @author Waseem Abbas
 *
 */
public class Franc extends Money{

	private String currency;
	
	public Franc( int amount, String currency ){
		super( amount, currency );
	}
	
	public Money times( int multiplier ){
		return Money.franc( amount * multiplier );
	}

	public String currency() {
		// TODO Auto-generated method stub
		return this.currency;
	}
	
}
