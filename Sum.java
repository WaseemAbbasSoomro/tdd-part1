/**
 * 
 */
package sibisoft;

/**
 * @author Waseem Abbas
 *
 */
public class Sum implements Expression {

	Expression augend;
	Expression addend;
	
	public Sum(Expression augend, Expression addend) {
		// TODO Auto-generated constructor stub
		this.augend = augend;
		this.addend = addend;
	}

	public Money reduce( Bank bank, String to) {
		// TODO Auto-generated method stub
		int addition = augend.reduce(bank, to).amount + addend.reduce(bank, to).amount;
		return new Money( addition,to );
	}
	
	public Expression plus( Expression addend ) {
		// TODO Auto-generated method stub
		return null;
	}

}
