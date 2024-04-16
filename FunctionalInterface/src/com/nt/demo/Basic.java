package com.nt.demo;

import java.util.Scanner;

public class Basic {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
				 System.out.println("Enter Num:");
			        int num= scanner.nextInt();
			        if(num%2==0){
			            System.out.println("Even Num");
			        }
			        else{
			            System.out.println("Odd Num");
			        }

			        scanner.close();
		

	}

}
