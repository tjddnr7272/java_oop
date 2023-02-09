package ezen.interfacee;

public class Gun implements Weapon /*X, Y, Z 다중구현 가능하다*/{

	@Override
	public void attack() {
         System.out.println("총을 쏩니다...");
	}

	
	
}
