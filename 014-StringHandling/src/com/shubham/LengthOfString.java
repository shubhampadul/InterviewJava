
package com.shubham;

public class LengthOfString {

	public static void main(String[] args) {
		String s1 = "";
		String s2 = "shubham";
		String s3 = new String("ab");
		String s4 = new String();
		String s5 = new String();

		System.out.println("s1 length:" + s1.length());
		System.out.println("s2 length:" + s2.length());
		System.out.println("s3 length:" + s3.length());
		System.out.println("s4 length:" + s4.length());

		String s6 = null;
		System.out.println("s6 length:" + s5.length());

	}

}
