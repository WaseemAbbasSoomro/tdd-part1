/**
 * 
 */
package sibisoft;

/**
 * @author Waseem Abbas
 *
 */
public class Dollor {

	int amount;
	
	public Dollor( int amount ){
		this.amount = amount;
	}
	
	public void times( int multiplier ){
		amount *= multiplier;
	}
	
}
