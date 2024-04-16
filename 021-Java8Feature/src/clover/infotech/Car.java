package clover.infotech;

public class Car implements Vechile {

	@Override
	public void start() {
		System.out.println("Start method satrt");
		
		
	}
	public static void main(String[] args) {
		Car car = new Car();
		car.clean();
		//Vechile.clean();
		car.start();
		

	}


}
