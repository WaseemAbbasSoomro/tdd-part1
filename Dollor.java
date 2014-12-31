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
		super( amount, currency );
	}
	
	public Money times( int multiplier ){
		return new Dollor( amount * multiplier, currency );
	}

	public String currency() {
		// TODO Auto-generated method stub
		return super.currency;
	}
	
}
