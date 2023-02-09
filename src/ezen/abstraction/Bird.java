package ezen.abstraction;


// 김정석 구현 클래스
public class Bird extends Animal {
	
	
	public Bird() {}
	
	public Bird(String name, int age) {
		this.name = name;
		this.age = age;    // private 가 아닌 protected이기 떄문에 쉽게 이용 가능
	}
	
	
	
	
	
	@Override
	public void cry() {
		System.out.println("쨱쨱~");
		
	}
	@Override
	public void eat() {
      System.out.println("먹이를 쪼아 먹습니다..");		
	}
	
	
	// 새로운 기능 추가
    public void fly() {
    	System.out.println("새가 날아갑니다..");
    }
}
