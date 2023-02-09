package oop;

import ezen.shape.Circle;
import ezen.shape.Lectangle;
import ezen.shape.Shape;




/**
 * @author 김성욱
 * @Date   2023. 1. 5.
 * 자바는 다형성을 지원하기 위해 클래스 자동 형변환과 메소드 재정의를 지원한다.
 */
public class PolymorphismExample2 {

	public static void main(String[] args) {
		Account account1 = new Account("1111", "김성욱" , 1111, 10000); 
		Account account2 = new Account("1111", "김성욱" , 1111, 10000); 
		System.out.println(account1.equals(account2));            
				
		
		 String name=" 김성욱 바보";
         System.out.println(account1.equals(name));
		
		
		
		
		
		
		

	}

}
