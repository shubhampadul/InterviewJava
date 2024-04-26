package clover.infotech;

import java.util.ArrayList;
import java.util.Collections;

public class NubersSort1 {

	
	//WAJP to store number in ArrayList And short number in desending order
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(5);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(1);
		
		System.out.println("Before shorting:"+al);
		
		
		//Collections.sort(al, new NumberComparator());
		
		//Collections.sort(al, (i,j) -> (i>j) ? -1 : 1);
		
		//System.out.println("After shorting :"+al);
		
		for(int i=0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		
		
		System.out.println("::::::::::::::::::::::::::::");
		
		for(int i : al) {
			System.out.println(i);
		}
		
		System.out.println(":::::::::::::::::::::::");
		
		al.forEach(i -> System.out.println(i));
		

	}
	
}
	
/*
 * class NumberComparator implements Comparator<Integer>{
 * 
 * @Override public int compare(Integer i, Integer j) {
 * 
 * if(i > j) { return -1; }else if (i < j) { return 1; } return 0; }
 * 
 * 
 * }
 */
	
	
