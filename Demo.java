/*
 * Name : Duc Huy Dao
 * ID : 1215210230
 * Assignment :2
 * This file solely purpose is only for testing the program
 */
package cse360assign2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a new AddingMachine object
		AddingMachine test = new AddingMachine();
		//testing
		test.add(5);
		test.subtract(3);
		test.add(11);
		String finalre = test.toString();
		int finaltotal = test.getTotal();
		System.out.println(finalre);
		System.out.println(finaltotal);
		
	}

}
