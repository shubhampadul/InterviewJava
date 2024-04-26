package clover.infotech;

import java.util.function.Supplier;

//OTP Generation

public class SupplierDemo {

	public static void main(String[] args) {
		
		
		String str = "XSDBHCJHBCKJJKCBHJCBHJBC";
		
	 Supplier<String> s = () -> {
		 String otp = "";
		 for(int i = 1; i<= 6; i++) {
			 otp = otp + (int) (Math.random() * 10);
		 }
		 
		 return otp;
			
		};
		
		System.out.println(s.get());
		System.out.println(s.get());
	 
	}

}
