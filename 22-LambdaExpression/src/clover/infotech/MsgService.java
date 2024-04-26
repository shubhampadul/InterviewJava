package clover.infotech;

import java.util.Optional;
import java.util.Scanner;

public class MsgService {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Id");
		
		int UserId = sc.nextInt();
		
		User user = new User();
		/*
		 * String userName = user.getUserByid(UserId);
		 * 
		 * if(userName!=null) {
		 * 
		 * String msg = userName.toUpperCase() + ", Hello";
		 * 
		 * System.out.println(msg); }else { System.out.println("Invalid Id"); }
		 */
		
		Optional<String> userName = user.getName(UserId);
		
		if(userName.isPresent()) {
			String name = userName.get();
			System.out.println(name.toUpperCase()+", Hello");
		}else {
			System.out.println("No data Found");
		}

	}
	
	
}

