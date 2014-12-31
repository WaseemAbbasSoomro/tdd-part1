/**
 * 
 */
package sibisoft;

/**
 * @author Waseem Abbas
 *
 */
public class Bank {
	
	Money reduce( Expression source, String to){
		Sum sum = (Sum) source;
		int addition = sum.augend.amount + sum.addend.amount;
		return new Money( addition,to );
	}
}
