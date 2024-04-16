package clover.infotech;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr= {4,2,3,1,10};
		
		/*
		 * for(int i=0;i<a.length;i++) { for(int j=i+1; j<a.length;j++) { if(a[i]>a[j])
		 * { int temp = a[i]; a[i]=a[j]; a[j]=temp;
		 * 
		 * } } } System.out.println(Arrays.toString(a));
		 */
		
		int num=5;
		int min=arr[0],max=arr[0];
		for(int i=0;i<num;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println(min+" "+max);
		
				
	
			
		}

	}

