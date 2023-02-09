package oop;

public class Child extends Parent{   //부모는 parent 하나만 쓸 수있다
//	String name;
//	int age;
//	추가 필드
	private String schoolName;  //초기화1 child입장
	
	
	//디폴트 생성자 만들떄 this 만들지 말기
public Child() {}  //멍텅구리 생성	
	
	
	






	public Child(String name, int age, String schoolName) {
	super(name, age);
	this.schoolName = schoolName;
}






	public Child(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}



	//	메소드 추가
	public void song() {
		System.out.println("노래를 부릅니다...");
	}
	
	

}
