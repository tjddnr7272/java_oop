package oop;

import ezen.shape.Circle;
import ezen.shape.Lectangle;
import ezen.shape.Shape;




/**
 * @author 김성욱
 * @Date   2023. 1. 5.
 * 자바는 다형성을 지원하기 위해 클래스 자동 형변환과 메소드 재정의를 지원한다.
 */
public class PolymorphismExample {

	public static void main(String[] args) {
		 // 기본타입 자동형변환
		double weight = 70;    //70.0을 70으로 자동형변환
		
		Shape shape = new Circle();
		shape.draw();
		// 클래스 자동형변환
		// 부모, 자식간에는 타입을 부모로 선언하면
		// 모든 자식 객체를 할당할 수 있다. 
         shape = new Circle();
         shape.draw();
		 shape = new Lectangle();    
		 shape.draw();
		 
		 
		 
//		 Shape shape = new Shape();
//       Circle circle = new Circle();
//		 Lectangle lectangle = new Lectangle();   
		
		
		
		
		
		
		

	}

}
