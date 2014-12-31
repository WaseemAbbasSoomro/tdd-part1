package sibisoft;

/**
 * @author Waseem Abbas
 *
 */
class Money {
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
	
	static Dollor dollor( int amount ){
		return new Dollor( amount, "USD" );
	}
	
	static Franc franc( int amount ){
		return new Franc( amount, "CHF" );
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

}
