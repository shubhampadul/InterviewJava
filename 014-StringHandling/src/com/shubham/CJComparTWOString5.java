package com.shubham;

public class CJComparTWOString5 {

	public static void main(String[] args) {
		String s1="abc"; 
		String s2="abc";
		String s3=new String("abc");
		String s4=new String("abc");
		
		StringBuffer sb1=new StringBuffer("cbc");
		StringBuffer sb2=new StringBuffer("cbc");
		System.out.println(".........................");
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1==sb2);
		
		System.out.println("...........");
		System.out.println(s1==s2);
		//System.out.println(s3==s4);
		
		System.out.println("..........");
		System.out.println(s3.equalsIgnoreCase(s4));
		
		String s5="a"; String s6="A";
		System.out.println(s5.equalsIgnoreCase(s6));
		
		
		

	}

}
