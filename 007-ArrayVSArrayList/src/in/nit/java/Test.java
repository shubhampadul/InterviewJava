package in.nit.java;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		int[] arr=new int[4];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
	//	arr[4]=5;
		//arr[3]=4;arr[0]=1;
		System.out.println(arr[3]);
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		System.out.println(al.get(2));

	}

}
