package sibisoft;

/**
 * @author Waseem Abbas
 *
 */
abstract class Money {
	protected int amount;
	
	public boolean equals( Object obj ){
		Money money = (Money) obj;
		return amount == money.amount && getClass().equals(money.getClass());
	}
	
	static Dollor dollor( int amount ){
		return new Dollor( amount );
	}
	
	static Franc franc( int amount ){
		return new Franc( amount );
	}
	
	abstract Money times( int multiplier );

}
