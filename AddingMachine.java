/*Name : Duc Huy Dao
 * ID : 1215210230
 *Assignment : 2
 *This is the second version of AddingMachine.java where neccessar changes to code has been made
 *In this program, I have added in an extra private variable for AddingMachine class : 
 *historyTranscation, which is a stringBuffer to keep track all of the history transcation has been made
 *to the machine
 */
package cse360assign2;

public class AddingMachine {

	private int total;
	private StringBuffer historyTranscation;
	/*
	 * this is constructor method for the class
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		historyTranscation = new StringBuffer("0");
	}
	/*
	 * return total
	 */
	public int getTotal () {
		return total;
	}
	/*
	 * add value to the current total
	 */
	public void add (int value) {
		total = total + value;
		historyTranscation.append(" + " + value);
	}
	/*
	 * minus value to the current total
	 */
	public void subtract (int value) {
		total = total - value;
		historyTranscation.append(" - "+ value);
	}
	/*
	 * return the history of all transcations in string	
	 */
	public String toString () {
		String returnobject = historyTranscation.toString();
		return returnobject;
	}

	public void clear() {
	
	}
}
