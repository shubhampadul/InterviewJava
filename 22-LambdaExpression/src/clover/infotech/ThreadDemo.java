package clover.infotech;

public class ThreadDemo {

	public static void main(String[] args) {
		
		
		/*
		 * Runnable r = new Runnable() {
		 * 
		 * @Override public void run() {
		 * 
		 * 
		 * for(int i=1; i<=5; i++) { System.out.println(i); }
		 * 
		 * } };
		 */
	
		 
		
		
		//Using Lambda Expression
		
		Runnable r = () -> {
			 
			 for(int i =1 ; i< 5; i++) {
				 System.out.println(i);
			 }
			
		};
		Thread t = new Thread();
		t.start();
	}
}


