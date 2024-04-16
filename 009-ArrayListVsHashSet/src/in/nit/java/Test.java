package in.nit.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args)throws IOException {
		
		 // size of ArrayList 
		int n=5;
		
		// declaring ArrayList with initial size n 
		ArrayList<Integer> al=new ArrayList<Integer>(n);
		
		//Appending the new element at the end of the list
		for(int i=1;i<=n;i++) {
			al.add(i);
		}
		//printlnig element
		System.out.println(al);
		
		// Remove element at index 3 
		al.remove(3);
		
		// Displaying ArrayList after deletion 
		System.out.println(al);
		
		// Printing elements one by one 
		for(int i=1;i<=al.size();i++) {
			System.out.println(al.get(i) + "");
		}
	

	}

}
