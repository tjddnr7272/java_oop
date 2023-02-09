package ezen.abstraction;

import java.awt.Component;

public class AbstractExample2 {

	public static void main(String[] args) {

		
		Car car = new SungWook2("김성욱","자동차", true , 120); 

		car.turnOn();
		car.run();
		car.speedUp(120);
		car.speedDown(30);
		car.stop();
		car.turnOff();
	
		
	
		
		
		 
	}

}
