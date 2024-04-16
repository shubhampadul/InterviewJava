package clover.infotech;

import java.util.Arrays;

public class MinAndMaxArray {

	public static void main(String[] args) {
		int[] arr = {4,1,7,10,8};
		//1 10
		int n=5;
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[n-1];
		System.out.println(min+"  "+max);

	}

}
