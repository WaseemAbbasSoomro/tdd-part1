/**
 * 
 */
package sibisoft;

/**
 * @author Waseem Abbas
 *
 */
public class Dollor {

	private int amount;
	
	public Dollor( int amount ){
		this.amount = amount;
	}
	
	public Dollor times( int multiplier ){
		return new Dollor( amount * multiplier );
	}
	
	public boolean equals( Object obj ){
		Dollor dollor = (Dollor) obj;
		return amount == dollor.amount;
	}
	
}
