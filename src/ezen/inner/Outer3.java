package ezen.inner;

public class Outer3 {
	
	String name;

	public void doTask() {
		int x = 10;
		System.out.println("doTask() 메소드 실행~~~~~");
		
		//지역 내부클래스 (1회용)
		class Helper{
	      public void someDo() {
	       System.out.println("someDo() 메소드 실행됨..");
            name = "헐...";    //x = 50; ... (내부클래스라서 접근X >final 붙이면 가능)
             System.out.println(x); //하지만 결과값은 낼수 있음...
			}
			
		}
		
		Helper helper = new Helper();
		helper.someDo(); //출력 후 깔끔하게 정리 됨
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		Outer3 out = new Outer3();
		out.doTask();
		
	}
	
}
