package in.nit.demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("Shubham");
		list.add("Raja");
		list.add("ramu");
		list.add("ramu");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
}
}