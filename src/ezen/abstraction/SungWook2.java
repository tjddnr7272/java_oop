package ezen.abstraction;

public class SungWook2 extends Car {
	
	
	
	
	
	public SungWook2(String name, String model, boolean status, int speed) {
		this.name = name;
		this.model = model;
		this.status = status;
		this.speed = speed;
		
	}
	
	
	
	
	
	
	
	
	
	

	@Override
	public void turnOn() {
		System.out.println("부릉부릉");

	}

	@Override
	public void turnOff() {
		
		System.out.println("부르릉");

	}

	@Override
	public void run() {

		System.out.println("부웅부웅");
		
	}

	@Override
	public void speedUp(int speed) {
		
		System.out.println("시속"+speed+"씽씽");

	}

	@Override
	public void speedDown(int speed) {
		System.out.println("시속"+speed+"씽씽다운");
		
	}

	@Override
	public void stop() {
		System.out.println("삐익");
	}

}
