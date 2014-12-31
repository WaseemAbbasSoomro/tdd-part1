package sibisoft;

/**
 * @author Waseem Abbas
 *
 */
class Money implements Expression {
	protected int amount;
	protected String currency;
	
	Money( int amount, String currency ){
		this.amount = amount;
		this.currency = currency;
	}
	
	public boolean equals( Object obj ){
		Money money = (Money) obj;
		return amount == money.amount && currency.equals(money.currency());
	}
	
	static Money dollor( int amount ){
		return new Money( amount, "USD" );
	}
	
	static Money franc( int amount ){
		return new Money( amount, "CHF" );
	}
	
	Money times( int multiplier ){
		return new Money( amount * multiplier, currency);
	}
	
	String currency(){
		return currency;
	}
	
	public String toString(){
		return amount + " " + currency;
	}

	public Expression plus( Money addend ) {
		// TODO Auto-generated method stub
		return new Sum( this, addend );
	}

}
