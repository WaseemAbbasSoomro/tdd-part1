/**
 * 
 */
package sibisoft;

/**
 * @author Waseem Abbas
 *
 */
public class Dollor extends Money{

	public Dollor( int amount ){
		this.amount = amount;
	}
	
	public Dollor times( int multiplier ){
		return new Dollor( amount * multiplier );
	}
	
}
