package ezen.interfacee;

public class WeaponExample {

	public static void main(String[] args) {
//                      Weapon weapon = new weapon 인터페이스니까 당연히 안됨
            		  // 인터페이스는 타입으로 선언 가능, 생성은 안된다.
		              // 자동형변환, 다형성
		             Weapon weapon = new Gun();
		             weapon.attack();
		             
		              weapon = new Sword();
		              weapon.attack();
		              
		              weapon = new Club();
		              weapon.attack();
		             
		             
		             
		             
		             
		             
	}

}
