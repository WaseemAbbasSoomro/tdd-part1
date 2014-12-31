/**
 * 
 */
package sibisoft;

/**
 * @author Waseem Abbas
 *
 */
public class Sum implements Expression {

	Money augend;
	Money addend;
	
	public Sum(Money augend, Money addend) {
		// TODO Auto-generated constructor stub
		this.augend = augend;
		this.addend = addend;
	}

	public Money reduce(String to) {
		// TODO Auto-generated method stub
		int addition = augend.amount + addend.amount;
		return new Money( addition,to );
	}
	

}
