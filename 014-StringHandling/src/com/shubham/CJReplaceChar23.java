package com.shubham;

public class CJReplaceChar23 {

	public static void main(String[] args) {
		String s1="abc xyz bcd";
		System.out.println(s1);
		String s2=s1.replace('y','z');
		System.out.println(s2);
		
		String s3=s1.replace("a","b");
		System.out.println(s3);
		
		String s4=s1.replaceAll("\\","#");
		System.out.println(s3);
		
	}

}
