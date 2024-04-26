package com.shubham;

public class CJCheckStringEmpty1 {

	public static void main(String[] args) {
		String s1="";
		String s2="";
		String s3="Hari";
		String s4=new String("Krushna");
		String s5=new String("");
		
		System.out.println("Enter String s1:"+s1.isEmpty());
		System.out.println("Enter String s2:"+s2.isEmpty());
		System.out.println("Enter String s3:"+s3.isEmpty());
		System.out.println("Enter String s4:"+s4.charAt(0));
		System.out.println("Enter String s4:"+s4.charAt(1));
		System.out.println(s2.isEmpty());
		System.out.println(s5.isEmpty());

	}

}
