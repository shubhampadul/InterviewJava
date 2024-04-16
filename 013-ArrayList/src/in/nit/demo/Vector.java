package in.nit.demo;

import java.util.Iterator;

public class Vector {

	public static void main(String[] args) {
		java.util.Vector<String> vec=new java.util.Vector<String>();
		vec.add("ramvchandra");
		vec.add("rafgu");
		vec.add("devchdar");
		vec.add("Tirupat");
		
		Iterator<String> itr=vec.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		}
	}

}
