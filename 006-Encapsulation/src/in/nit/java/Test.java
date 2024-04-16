
package in.nit.java;

public class Test extends Account {

	public static void main(String[] args) {
		// creating instance of Account class
		Account acc = new Account();
		// setting values through setter methods
		/*
		 * acc.setAcc_no(7560504000L); acc.setName("Sonoo Jaiswal");
		 * acc.setEmail("sonoojaiswal@javatpoint.com"); acc.setAmount(500000f);
		 */
		acc.setAcc_no(476588L);
		acc.setName("Shubham Padul");
		acc.setEmail("shubhampadul070@gmail.com");
		acc.setAmount(85335);
		// getting values through getter methods
           System.out.println(acc.getAcc_no() + " " + acc.getName() + "" +acc.getEmail() + "" + acc.getAmount()) ;
           
           
	}

	
}
