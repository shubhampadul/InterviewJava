package com.shubham;

public class CJStringBufferAppend26 {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abc");
		
		StringBuffer sb1 = new StringBuffer("Shubham");
	    System.out.println("CJStringBufferAppend26.main():"+sb1.capacity());
		System.out.println("SB capacity:"+sb.capacity());
		System.out.println("Length:"+sb.length());  
		System.out.println(sb);
		
		System.out.println();
		
		sb.append("a");
		System.out.println("capacity:"+sb.capacity());
		System.out.println("Length:"+sb.length());
		System.out.println(sb);
		System.out.println();
		
		
	}

}
