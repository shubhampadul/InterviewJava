package clover.infotech;

import java.util.Optional;

public class User {

	
		public String getUserByid(Integer id) {
			
		 if(id == 100) {
			 
			 return "Raja";
			 
		 } else if (id == 101) {
			 return "Rani"; 
		 }else if(id == 102) {
			 return "Shubham";
		 }
		return null;
		}
		
		public Optional<String> getName(Integer id){
			
			String name = null;
			
			if(id == 100 ) {
				name = "Raja";
				
			}else if(id == 101) {
				name ="Rani";
			}
			else if (id == 102) {
				name = "John";
			}
			
			return Optional.ofNullable(name);
		}


	}


