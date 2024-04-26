package clover.infotech;

import java.util.StringJoiner;

public class StringJoinerDemo {
	
	
	public static void main(String[] args) {
		
		StringJoiner sj1 = new StringJoiner("-");
		
	    sj1.add("Raja");
	    sj1.add("it");
	    sj1.add("java");
	    System.out.println(sj1);		
	    
	    
	    StringJoiner sj2 = new StringJoiner("-" , "(", ")");
	    
	    sj2.add("Raja");
	    sj2.add("it");
	    sj2.add("java");
	    System.out.println(sj2);		
	    
	    
	    

	}

}
