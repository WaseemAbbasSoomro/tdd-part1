package sibisoft;

/**
 * @author Waseem Abbas
 *
 */
abstract class Money {
	protected int amount;
	protected String currency;
	
	public boolean equals( Object obj ){
		Money money = (Money) obj;
		return amount == money.amount && getClass().equals(money.getClass());
	}
	
	static Dollor dollor( int amount ){
		return new Dollor( amount, "USD" );
	}
	
	static Franc franc( int amount ){
		return new Franc( amount, "CHF" );
	}
	
	abstract Money times( int multiplier );
	abstract String currency();

}
