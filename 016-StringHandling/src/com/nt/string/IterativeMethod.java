package com.nt.string;

public class IterativeMethod {

	public static void main(String[] args) {
		String s1="Shubham";
		char[] Chararray=s1.toCharArray();
		for(int i=Chararray.length-1; i>0;i--) {
			System.out.println(Chararray[i]);
			
		}

	}

}
