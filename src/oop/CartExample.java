package oop;

import java.util.Date;

import com.ezen.shop.Cart;

//import com.ezen.shop.Cart;

//권장
//import com.ezen.shop.Cart;   //사용하고자 하는 패키지 명을 입력
//비권장
//import com.ezen.shop.*;   
// static import 사용하기        
import static java.lang.System.out;
import static java.lang.Math.*;              //Math 클래스 안에있는 모든 스태틱 메소드 임포트

public class CartExample {

	public static void main(String[] args) {
		Cart cart;                  //임포트 적용 단축키:컨+shift+o // 부분선택:컨+shift+m
//		com.ezen.shop.Cart cart;     한번만 쓸 경우 import 포함해서 입력 
		cart = new Cart();
		cart.addItem("쵸코파이");   //호출
		
		
		Date today = new Date();
		String ymd= today.toLocaleString();   //날짜 소환, deprecate 주의
		System.out.println(ymd);
		
		
		out.println("스태틱 임포트 사용하기...");
		
		int x = 40, y = 35;         //어떤게 최대값? > 메소드 호출 (max 컨 시)
  //      int result = max(x, y);    비권장
 		                               
        int result = Math.max(x, y); //권장
        System.out.println(result);
	}

}
