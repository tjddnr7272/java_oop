package ezen.interfacee;

/**
 * 인터페이스 간에도 상속이 가능하며, 거기다가 다중상속까지 가능하다.
 * @author 김성욱
 * @Date   2023. 1. 6.
 */
public interface Spec2 extends Spec1 , Weapon {
	public void doTask3();    //extends 하는 동시에 상속..(dotask1,2,3)
	
	
}

