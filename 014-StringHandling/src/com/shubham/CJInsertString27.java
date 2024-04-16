package com.shubham;

public class CJInsertString27 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("123456789");
		System.out.println("SB Char:"+sb);
		
		sb.insert(9,'-');
		System.out.println(sb);
		System.out.println();
		
		sb.insert(sb.length()-1,'-');
		System.out.println(sb);
	}

}
