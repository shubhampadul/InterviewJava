package com.shubham;

public class CJUpperCaseLowerCase21 {

	public static void main(String[] args) {
		String s1="SHuBhAMpADul";
		System.out.println("s1:"+s1);
		s1.toUpperCase();
		System.out.println(s1);
		System.out.println();
		String s2=s1.toUpperCase();
		System.out.println(s2);
		System.out.println();
        String s3=s1.toLowerCase();
        System.out.println(s3);
        String s4=s3.toLowerCase();
        System.out.println(s4);
        System.out.println();
        System.out.println(s2==s3);
	}

}
