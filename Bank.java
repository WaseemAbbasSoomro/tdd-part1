/**
 * 
 */
package sibisoft;

import java.util.Hashtable;

/**
 * @author Waseem Abbas
 *
 */
public class Bank {
	
	private Hashtable<Pair,Integer> rates = new Hashtable<Pair,Integer>();
	
	Money reduce( Expression source, String to){
		return source.reduce( this,to );
	}

	public void addRate(String from, String to, int rate) {
		// TODO Auto-generated method stub
		rates.put( new Pair(from,to), rate );
	}
	
	int rate( String from, String to ){
		if( from.equals(to) )
			return 1;
		
		Integer rate = (Integer) rates.get(new Pair( from, to) );
		return rate.intValue(); 
	}
}
