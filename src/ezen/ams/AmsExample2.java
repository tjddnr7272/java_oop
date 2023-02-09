package ezen.ams;


public class AmsExample2 {

	public static void main(String[] args) {
		System.out.println("애플리케이션 시작됨");
		AccountRepository repository = new ArrayAccountRepository(1000);
		//신규계좌 등록
		Account account = new Account("1111-2222-3333", "홍길동", 1234, 100000); 
			repository.addAccount(account);
			System.out.println("신규계좌 등록완료!");
			repository.addAccount(new Account("1111-2222-3333", "홍길동", 1234, 100000));
			System.out.println("신규계좌 등록완료!");
			repository.addAccount(new MinusAccount("1111-2222-3333", "홍길동", 1234, 100000,1000000,"2023.2.3"));
			System.out.println("신규계좌 등록완료!");

			
			Account[] list = repository.getAccounts();
			for (int i = 0; i < repository.getCount(); i++) {
				
				
			}
			
		

	}

}
