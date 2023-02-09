package ezen.interfacee;

public class DriverExample2 {

	public static void main(String[] args) {
		Car2 car2 = new K32("수미", "K3",false, 0); 
		Driver2 driver2 = new Driver2(car2);
		driver2.drive2();
		
		car2 = new Avante2("수미", "K3",false, 0);
		driver2.setCar2(car2);
		driver2.drive2();
	
		
		
	
	}

}
