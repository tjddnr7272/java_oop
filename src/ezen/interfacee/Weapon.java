package ezen.interfacee;


/**
 * 유닛이 사용하는 모든 무기들에 대한 표준 규약(명세)
 * 인터페이스 - 역할 
 * 인터페이스는 100프로 추상메소드로만 구성된다.
 * @author 김성욱
 * @Date   2023. 1. 6.
 */
public interface Weapon {
    /*public static final */ int WEIGHT= 1; //자동토함 
	
    /*public abstract*/ public void attack(); //public 안붙여도 public abstract 자동 추가됨   
	
	
}
