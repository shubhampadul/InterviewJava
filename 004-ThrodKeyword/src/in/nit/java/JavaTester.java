package in.nit.java;

public class JavaTester {
	public void checkVoting(int age) {
		if(age<18)
			throw new ArithmeticException("Youre age not mathch for voting please try after completed.");
		
		else 
			System.out.println("You are elagable for votig This First voting");
	}
	 public static void main(String args[]) {
		 JavaTester jt=new JavaTester();
		 jt.checkVoting(19);
		 System.out.println("Ending program");
	 }
	}
