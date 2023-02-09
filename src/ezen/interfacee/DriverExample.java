package ezen.interfacee;

public class DriverExample {

	public static void main(String[] args) {
		
		Car car = new K3("수미", "K3",false, 0);
		Driver driver = new Driver(car);   //Car car 에서 뒤에 car
		driver.drive();
		
		
		car = new Avante("김수미", "아반떼", false , 0);
		driver.setCar(car);
		driver.drive();
		
		

	}

}
