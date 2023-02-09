package ezen.interfacee;

public class Driver2 {
	
	
	private Car2 car2;
	
	public Driver2() {}
			public Driver2(Car2 car2) {
				this.car2 = car2;
			}
			public Car2 getCar2() {
				return car2;
			}
			public void setCar2(Car2 car2) {
				this.car2 = car2;
			}
	
			public void drive2() {
				car2.turnOn();
				car2.run();
				car2.speedUp(10);
				car2.speedDown(5);
				car2.stop();
				car2.turnOff();
				
				
			}
			
			
	

}
