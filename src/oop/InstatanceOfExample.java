package oop;

public class InstatanceOfExample {

	public static void main(String[] args) {
		Bird bird = new Bird();
		
		
		System.out.println(bird instanceof Bird);
		System.out.println(bird instanceof Animal);  
		System.out.println(bird instanceof Object);   //같은 직계일때에는 전부 true로 떨어진다.
//		System.out.println(bird instanceof String);  

	}

}
