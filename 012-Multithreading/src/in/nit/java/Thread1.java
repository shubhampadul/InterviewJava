package in.nit.java;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		

	}

	public static void main(String[] args) {
		Thread thread1=new Thread("Raja");
		Thread thread2=new Thread("Ramu");
		thread1.start();
		thread2.start();
		System.out.println("ThreadFollowing");
		
		  System.out.println(thread1.getName());
		  System.out.println(thread2.getName());
		 

	}

}
