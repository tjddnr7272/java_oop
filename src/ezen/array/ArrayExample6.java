package ezen.array;

/**
 * @author 김성욱
 * @date 2023. 1. 2.
 * 참조형 배열 선언, 생성, 사용 방법
 */
public class ArrayExample6 {

	public static void main(String[] args) {
		// 1차원 참조형 배열 선언
		String[] strings;
		// 생성
		strings = new String[5];
//		strings[0] = new String("Java"); // 명시적 생성
		strings[0] = "Java" ; //묵시적 생성
		strings[1] = "C" ; //묵시적 생성
		strings[2] = "C++" ; //묵시적 생성
		strings[3] = "C#" ; //묵시적 생성
		strings[4] = "python" ; //묵시적 생성
		
		//0만 출력!
		System.out.println(strings[0]);
		
		//0~4 전부 출력해보자! + 몇글자인가?!
		for (int i = 0; i <strings.length; i++) {
			
			
		//  String language = strings[i]; 아래거 이해 안가면 요걸로 이해!
//			System.out.println(strings[i] + "("+language.length()+")");  아랫거 이해 안가면 요걸로 이해!
			
			
			System.out.println(strings[i] + "("+strings[i].length()+")"); // length는 참조라는 개념을 잘 각인!
			
		}
		
		//배열 선언 , 생성, 초기화를 동시에 하는방법!
//		String[] teams = new String[] {new String("sk"), new String("lg") new String ("두산")} ;  //축약
//		String[] teams = new String{new String("sk"), new String("lg") new String ("두산")} ;  //또 축약!
		String[] teams = {"sk",  "lg" , "두산"};  //최종 축약!
		for (int i = 0; i <teams.length; i++) {
			System.out.println(teams[i]);
		}
		
		// 다차원 배열
		String[][] arrays = new String[3][5];  // 2차원 문자열 배열 그룹별로 선언 
		arrays[0][0] = "java";                     //저장해보자
		//...
		arrays[2][4] = "html";
		
		for (int i = 0; i < arrays.length; i++) { //밖에 3번 반복
			for (int j = 0; j < arrays[i].length; j++) { //5번 (반복)돌아야 하니!
				System.out.println(arrays[i][j]);
				
			}                        
			
		}
		
		
		
//		
//		//몇자리로 구성된 숫자인가?!
//	
//		int num = 100; 
//		String strNum = String.valueOf(num);   //문자열로 바꾸기 위한 형변환
//		int count = strNum.length();   //갯수, 자릿수
//		System.out.println(count + "자리입니다..");
//		
		
		
	
		
		
		


	}

}
