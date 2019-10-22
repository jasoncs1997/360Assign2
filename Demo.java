package cse360assign3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator test = new Calculator();
		
		test.add(5);
		test.power(-3);
		test.mult(4);
		test.add(10);
		test.div(4);
		String finalre = test.toString();
		int finaltotal = test.getTotal();
		System.out.println(finalre);
		System.out.println(finaltotal);
		
		
	}

}
