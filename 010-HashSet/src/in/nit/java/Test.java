package in.nit.java;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class Test {

	public static void main(String[] args)throws IOException {
		
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		
		//Dublicat remove
		hs.remove(40);
		
		// Displaying HashSet elements
		for(Integer temp:hs) {
			System.out.println(temp + "");

	}

}
}
