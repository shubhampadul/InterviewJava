package com.bajajAllianz;

public class StringBuffer {

	public static void main(String[] args) {
		String s1 = new String("Shuham");
		
		String s = "Shubham";
		StringBuilder sb1 = new StringBuilder("Shubham ");
		
		StringBuffer sb2 = new StringBuffer();
		
		sb1.append("padul");
		
		s.concat(s);
		System.out.println("String immutable:"+ s);
		
	    s = s.concat("PAdul");
	    
	    System.out.println("String immutable:"+ s);
		
		
		System.out.println("sb2 :"+sb2);
		
		System.out.println("sb1 :"+sb1);
		
		  // creating Java string by new keyword
        // this statement create two object i.e
        // first the object is created in heap
        // memory area and second the object is
        // created in String constant pool.
		System.out.println("s1: "+s1);
	}

}
