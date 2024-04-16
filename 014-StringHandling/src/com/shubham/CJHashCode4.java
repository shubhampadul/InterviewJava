package com.shubham;

public class CJHashCode4 {

	public static void main(String[] args) {
		String s1=new String("a");
		String s2=new String("b");
		String s3=new String("abc");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(".............");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.identityHashCode(System.identityHashCode(s3));
	}

}
