package com.shubham;

public class CJStringJoin20 {

	public static void main(String[] args) {
		String s1=String.join(",","a","b","c","d");
		String s2=String.join("","a","b" );
		String s3=String.join("","a", new StringBuffer("b"),new StringBuffer("c"));
		System.out.println("s1`:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		

	}

}
