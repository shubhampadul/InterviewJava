package com.shubham;

public class CJStringConcat18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="shubham"; 
		String s2=s1.concat("  Padul");
		System.out.println(s2);

		String s3="abc";
		s3.concat("cbc");
		System.out.println(s3);
		System.out.println();
		
		String s4=s3.concat("cbc");
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		System.out.println(s3==s4);
		
	}

}
