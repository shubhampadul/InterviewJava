package clover.infotech;

interface Vechile {
	public void start();
	
	public default void clean() {
		System.out.println("Vechile default method");
		
	} 

}

