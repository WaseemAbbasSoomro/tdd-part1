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
		return source.reduce( this,to );
	}

	public void addRate(String string, String string2, int i) {
		// TODO Auto-generated method stub
		
	}
	
	int rate( String from, String to ){
		return from.equals("CHF") && to.equals("USD") ? 2 : 1;
	}
}
