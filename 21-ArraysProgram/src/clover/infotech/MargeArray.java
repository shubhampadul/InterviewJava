package clover.infotech;

import java.util.Arrays;

//merge the two arrays into single arrays
public class MargeArray {
                                           
	public static void main(String[] args) { 

		int[] a = {1,2,3};
		int[] b = {4,5,6};
		
		int[] c = new int[a.length + b.length];
		for(int i=0; i<a.length; i++) {
			c[i]=a[i];//{1,2,3}
			
		}
		for(int i = 0; i<a.length; i++) {
			c[i+a.length]=b[i]; //{4,5,6}
		}
		System.out.println(Arrays.toString(c));
			
		}
		
	}


